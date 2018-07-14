package tsse.vodafone.com.envisionestask.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OnlineCarsModel {

    @SerializedName("cars")
    List<CarsModel> list;
}
