package tsse.vodafone.com.envisionestask;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.Calendar;
import java.util.TimeZone;

import tsse.vodafone.com.envisionestask.adapters.CarsAdapter;
import tsse.vodafone.com.envisionestask.models.BusinessError;
import tsse.vodafone.com.envisionestask.models.CarsModel;
import tsse.vodafone.com.envisionestask.presenters.OnlineCarsPresenter;
import tsse.vodafone.com.envisionestask.services.UpdateCarsService;
import tsse.vodafone.com.envisionestask.views.OnlineCarsView;

public class MainActivity extends AppCompatActivity implements OnlineCarsView ,SwipeRefreshLayout.OnRefreshListener{

    private static final String TAG = MainActivity.class.getSimpleName();
    private OnlineCarsPresenter onlineCarsPresenter;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        onlineCarsPresenter = new OnlineCarsPresenter();
        onlineCarsPresenter.attachView(this);
        loadOnlineCars();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        swipeRefreshLayout.setRefreshing(true);
                                        loadOnlineCars();
                                    }
                                }
        );
        setRecurringAlarm(this);

    }

    private void findViews() {
        recyclerView = (RecyclerView) findViewById(R.id.cars_recycleview);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
    }

    @Override
    public void onFinishedLoadingSuccessfully(CarsModel carsModel) {
        swipeRefreshLayout.setRefreshing(true);
        recyclerView.setAdapter(new CarsAdapter(carsModel.getCars(), R.layout.list_item_car, getApplicationContext()));

    }

    @Override
    public void onFinishedLoadingError(BusinessError carsModel) {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onRefresh() {

    }

    private void loadOnlineCars() {
        swipeRefreshLayout.setRefreshing(true);
        onlineCarsPresenter.loadData();
        swipeRefreshLayout.setRefreshing(false);
    }

    public class UpdateCarsReceivers extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Intent dailyUpdater = new Intent(context, UpdateCarsService.class);
            context.startService(dailyUpdater);
            Log.d(TAG, "Called context.startService from AlarmReceiver.onReceive");
        }
    }

    private void setRecurringAlarm(Context context) {
        Calendar updateTime = Calendar.getInstance();
        updateTime.setTimeZone(TimeZone.getDefault());
        updateTime.set(Calendar.HOUR_OF_DAY, 12);
        updateTime.set(Calendar.MINUTE, 30);
        Intent downloader = new Intent(context, UpdateCarsReceivers.class);
        downloader.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, downloader,       PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, updateTime.getTimeInMillis(), AlarmManager.INTERVAL_FIFTEEN_MINUTES, pendingIntent);
        Log.d(TAG, "Set alarmManager.setRepeating to: " + updateTime.getTime().toLocaleString());
    }
}
