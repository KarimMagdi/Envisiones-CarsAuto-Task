package tsse.vodafone.com.envisionestask.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import tsse.vodafone.com.envisionestask.models.CarsModel;

public interface RestInterface {

    @GET("v2/carsonline")
    Call<CarsModel> getOnlineCars();


}
