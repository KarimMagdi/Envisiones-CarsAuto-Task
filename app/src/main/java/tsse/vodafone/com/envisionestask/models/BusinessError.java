package tsse.vodafone.com.envisionestask.models;

public class BusinessError {
    private int errorCode;
    private String errorMessage;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {

        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public BusinessError(int errorCode, String errorMessage) {

        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
