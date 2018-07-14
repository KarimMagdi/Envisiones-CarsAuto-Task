package tsse.vodafone.com.envisionestask.models;



import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CarsModel implements Serializable, Parcelable
{

    @SerializedName("alertEn")
    @Expose
    private String alertEn;
    @SerializedName("alertAr")
    @Expose
    private String alertAr;
    @SerializedName("Error")
    @Expose
    private Error error;
    @SerializedName("RefreshInterval")
    @Expose
    private int refreshInterval;
    @SerializedName("Ticks")
    @Expose
    private String ticks;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("endDate")
    @Expose
    private int endDate;
    @SerializedName("sortOption")
    @Expose
    private String sortOption;
    @SerializedName("sortDirection")
    @Expose
    private String sortDirection;
    @SerializedName("Cars")
    @Expose
    private List<Car> cars = null;
    public final static Parcelable.Creator<CarsModel> CREATOR = new Creator<CarsModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public CarsModel createFromParcel(Parcel in) {
            return new CarsModel(in);
        }

        public CarsModel[] newArray(int size) {
            return (new CarsModel[size]);
        }

    }
            ;
    private final static long serialVersionUID = 6787727924704767514L;

    protected CarsModel(Parcel in) {
        this.alertEn = ((String) in.readValue((String.class.getClassLoader())));
        this.alertAr = ((String) in.readValue((String.class.getClassLoader())));
        this.error = ((Error) in.readValue((Error.class.getClassLoader())));
        this.refreshInterval = ((int) in.readValue((int.class.getClassLoader())));
        this.ticks = ((String) in.readValue((String.class.getClassLoader())));
        this.count = ((int) in.readValue((int.class.getClassLoader())));
        this.endDate = ((int) in.readValue((int.class.getClassLoader())));
        this.sortOption = ((String) in.readValue((String.class.getClassLoader())));
        this.sortDirection = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.cars, (Car.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public CarsModel() {
    }

    /**
     *
     * @param sortOption
     * @param refreshInterval
     * @param count
     * @param error
     * @param ticks
     * @param cars
     * @param alertAr
     * @param endDate
     * @param alertEn
     * @param sortDirection
     */
    public CarsModel(String alertEn, String alertAr, Error error, int refreshInterval, String ticks, int count, int endDate, String sortOption, String sortDirection, List<Car> cars) {
        super();
        this.alertEn = alertEn;
        this.alertAr = alertAr;
        this.error = error;
        this.refreshInterval = refreshInterval;
        this.ticks = ticks;
        this.count = count;
        this.endDate = endDate;
        this.sortOption = sortOption;
        this.sortDirection = sortDirection;
        this.cars = cars;
    }

    public String getAlertEn() {
        return alertEn;
    }

    public void setAlertEn(String alertEn) {
        this.alertEn = alertEn;
    }

    public CarsModel withAlertEn(String alertEn) {
        this.alertEn = alertEn;
        return this;
    }

    public String getAlertAr() {
        return alertAr;
    }

    public void setAlertAr(String alertAr) {
        this.alertAr = alertAr;
    }

    public CarsModel withAlertAr(String alertAr) {
        this.alertAr = alertAr;
        return this;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public CarsModel withError(Error error) {
        this.error = error;
        return this;
    }

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public CarsModel withRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }

    public String getTicks() {
        return ticks;
    }

    public void setTicks(String ticks) {
        this.ticks = ticks;
    }

    public CarsModel withTicks(String ticks) {
        this.ticks = ticks;
        return this;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CarsModel withCount(int count) {
        this.count = count;
        return this;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public CarsModel withEndDate(int endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getSortOption() {
        return sortOption;
    }

    public void setSortOption(String sortOption) {
        this.sortOption = sortOption;
    }

    public CarsModel withSortOption(String sortOption) {
        this.sortOption = sortOption;
        return this;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public CarsModel withSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public CarsModel withCars(List<Car> cars) {
        this.cars = cars;
        return this;
    }



    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(alertEn);
        dest.writeValue(alertAr);
        dest.writeValue(error);
        dest.writeValue(refreshInterval);
        dest.writeValue(ticks);
        dest.writeValue(count);
        dest.writeValue(endDate);
        dest.writeValue(sortOption);
        dest.writeValue(sortDirection);
        dest.writeList(cars);
    }

    public int describeContents() {
        return  0;
    }


}
