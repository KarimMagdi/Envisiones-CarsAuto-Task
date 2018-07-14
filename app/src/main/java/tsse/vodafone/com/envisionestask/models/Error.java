package tsse.vodafone.com.envisionestask.models;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;


public class Error implements Serializable, Parcelable
{

    public final static Parcelable.Creator<Error> CREATOR = new Creator<Error>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Error createFromParcel(Parcel in) {
            return new Error(in);
        }

        public Error[] newArray(int size) {
            return (new Error[size]);
        }

    }
            ;
    private final static long serialVersionUID = 7599496692287598518L;

    protected Error(Parcel in) {
    }



    public void writeToParcel(Parcel dest, int flags) {
    }

    public int describeContents() {
        return  0;
    }

}
