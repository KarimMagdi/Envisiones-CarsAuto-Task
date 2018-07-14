package tsse.vodafone.com.envisionestask.services;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import tsse.vodafone.com.envisionestask.MainActivity;
import tsse.vodafone.com.envisionestask.models.BusinessError;
import tsse.vodafone.com.envisionestask.models.CarsModel;
import tsse.vodafone.com.envisionestask.presenters.OnlineCarsPresenter;
import tsse.vodafone.com.envisionestask.views.OnlineCarsView;

public class UpdateCarsService extends IntentService implements OnlineCarsView {

    private static final String TAG = MainActivity.class.getSimpleName();
    private OnlineCarsPresenter onlineCarsPresenter;
    public UpdateCarsService() {
        super("Cars Services");
        onlineCarsPresenter = new OnlineCarsPresenter();
        onlineCarsPresenter.attachView(this);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "About to execute MyTask");
        new MyTask().execute();
        onlineCarsPresenter.loadData();
    }

    @Override
    public void onFinishedLoadingSuccessfully(CarsModel carsModel) {

    }

    @Override
    public void onFinishedLoadingError(BusinessError businessError) {

    }

    private class MyTask extends AsyncTask<String, Void, Boolean> {
        @Override
        protected Boolean doInBackground(String... strings) {
            Log.d(TAG, "Calling doInBackground within MyTask");
            return false;
        }
    }

    private void sendNotification(Context context) {
        Intent notificationIntent = new Intent(context, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        NotificationManager notificationMgr = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification =  new Notification(android.R.drawable.star_on, "Refresh", System.currentTimeMillis());
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
       // notification.setLatestEventInfo(context, "Title","Content", contentIntent);
        notificationMgr.notify(0, notification);
    }
}
