package tsse.vodafone.com.envisionestask.presenters;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tsse.vodafone.com.envisionestask.models.BusinessError;
import tsse.vodafone.com.envisionestask.models.CarsModel;
import tsse.vodafone.com.envisionestask.rest.RestClient;
import tsse.vodafone.com.envisionestask.rest.RestInterface;
import tsse.vodafone.com.envisionestask.views.OnlineCarsView;

public class OnlineCarsPresenter {

    private OnlineCarsView onlineCarsView;

    public void attachView(OnlineCarsView onlineCarsView) {
        this.onlineCarsView = onlineCarsView;
    }

    public void loadData(){
        RestInterface apiService =
                RestClient.getClient().create(RestInterface.class);

        Call<CarsModel> call = apiService.getOnlineCars();
        call.enqueue(new Callback<CarsModel>() {
            @Override
            public void onResponse(Call<CarsModel>call, Response<CarsModel> response) {
                CarsModel carsModels = (CarsModel) response.body();
                Log.d("","response:"+carsModels);
                onlineCarsView.onFinishedLoadingSuccessfully(carsModels);
            }

            @Override
            public void onFailure(Call<CarsModel>call, Throwable t) {
                BusinessError businessError = new BusinessError(100,"");
                onlineCarsView.onFinishedLoadingError(businessError);


            }
        });
    }
}
