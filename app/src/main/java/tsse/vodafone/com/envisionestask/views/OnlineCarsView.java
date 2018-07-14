package tsse.vodafone.com.envisionestask.views;

import java.util.List;

import tsse.vodafone.com.envisionestask.models.BusinessError;
import tsse.vodafone.com.envisionestask.models.CarsModel;

public interface OnlineCarsView {

    void onFinishedLoadingSuccessfully(CarsModel carsModel);

    void onFinishedLoadingError(BusinessError businessError);
}
