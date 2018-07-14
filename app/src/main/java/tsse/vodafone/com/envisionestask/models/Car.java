package tsse.vodafone.com.envisionestask.models;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Car implements Serializable, Parcelable
{

    @SerializedName("carID")
    @Expose
    private int carID;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("descriptionAr")
    @Expose
    private String descriptionAr;
    @SerializedName("descriptionEn")
    @Expose
    private String descriptionEn;
    @SerializedName("imgCount")
    @Expose
    private int imgCount;
    @SerializedName("sharingLink")
    @Expose
    private String sharingLink;
    @SerializedName("sharingMsgEn")
    @Expose
    private String sharingMsgEn;
    @SerializedName("sharingMsgAr")
    @Expose
    private String sharingMsgAr;
    @SerializedName("mileage")
    @Expose
    private String mileage;
    @SerializedName("makeID")
    @Expose
    private int makeID;
    @SerializedName("modelID")
    @Expose
    private int modelID;
    @SerializedName("bodyId")
    @Expose
    private int bodyId;
    @SerializedName("year")
    @Expose
    private int year;
    @SerializedName("makeEn")
    @Expose
    private String makeEn;
    @SerializedName("makeAr")
    @Expose
    private String makeAr;
    @SerializedName("modelEn")
    @Expose
    private String modelEn;
    @SerializedName("modelAr")
    @Expose
    private String modelAr;
    @SerializedName("bodyEn")
    @Expose
    private String bodyEn;
    @SerializedName("bodyAr")
    @Expose
    private String bodyAr;
    @SerializedName("AuctionInfo")
    @Expose
    private AuctionInfo auctionInfo;
    public final static Parcelable.Creator<Car> CREATOR = new Creator<Car>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        public Car[] newArray(int size) {
            return (new Car[size]);
        }

    }
            ;
    private final static long serialVersionUID = 1669210950533983029L;

    protected Car(Parcel in) {
        this.carID = ((int) in.readValue((int.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.descriptionAr = ((String) in.readValue((String.class.getClassLoader())));
        this.descriptionEn = ((String) in.readValue((String.class.getClassLoader())));
        this.imgCount = ((int) in.readValue((int.class.getClassLoader())));
        this.sharingLink = ((String) in.readValue((String.class.getClassLoader())));
        this.sharingMsgEn = ((String) in.readValue((String.class.getClassLoader())));
        this.sharingMsgAr = ((String) in.readValue((String.class.getClassLoader())));
        this.mileage = ((String) in.readValue((String.class.getClassLoader())));
        this.makeID = ((int) in.readValue((int.class.getClassLoader())));
        this.modelID = ((int) in.readValue((int.class.getClassLoader())));
        this.bodyId = ((int) in.readValue((int.class.getClassLoader())));
        this.year = ((int) in.readValue((int.class.getClassLoader())));
        this.makeEn = ((String) in.readValue((String.class.getClassLoader())));
        this.makeAr = ((String) in.readValue((String.class.getClassLoader())));
        this.modelEn = ((String) in.readValue((String.class.getClassLoader())));
        this.modelAr = ((String) in.readValue((String.class.getClassLoader())));
        this.bodyEn = ((String) in.readValue((String.class.getClassLoader())));
        this.bodyAr = ((String) in.readValue((String.class.getClassLoader())));
        this.auctionInfo = ((AuctionInfo) in.readValue((AuctionInfo.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Car() {
    }

    /**
     *
     * @param sharingLink
     * @param mileage
     * @param sharingMsgEn
     * @param bodyEn
     * @param descriptionEn
     * @param descriptionAr
     * @param image
     * @param bodyId
     * @param makeEn
     * @param modelID
     * @param carID
     * @param sharingMsgAr
     * @param bodyAr
     * @param modelEn
     * @param auctionInfo
     * @param modelAr
     * @param year
     * @param makeID
     * @param imgCount
     * @param makeAr
     */
    public Car(int carID, String image, String descriptionAr, String descriptionEn, int imgCount, String sharingLink, String sharingMsgEn, String sharingMsgAr, String mileage, int makeID, int modelID, int bodyId, int year, String makeEn, String makeAr, String modelEn, String modelAr, String bodyEn, String bodyAr, AuctionInfo auctionInfo) {
        super();
        this.carID = carID;
        this.image = image;
        this.descriptionAr = descriptionAr;
        this.descriptionEn = descriptionEn;
        this.imgCount = imgCount;
        this.sharingLink = sharingLink;
        this.sharingMsgEn = sharingMsgEn;
        this.sharingMsgAr = sharingMsgAr;
        this.mileage = mileage;
        this.makeID = makeID;
        this.modelID = modelID;
        this.bodyId = bodyId;
        this.year = year;
        this.makeEn = makeEn;
        this.makeAr = makeAr;
        this.modelEn = modelEn;
        this.modelAr = modelAr;
        this.bodyEn = bodyEn;
        this.bodyAr = bodyAr;
        this.auctionInfo = auctionInfo;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public Car withCarID(int carID) {
        this.carID = carID;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Car withImage(String image) {
        this.image = image;
        return this;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public Car withDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
        return this;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public Car withDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }

    public int getImgCount() {
        return imgCount;
    }

    public void setImgCount(int imgCount) {
        this.imgCount = imgCount;
    }

    public Car withImgCount(int imgCount) {
        this.imgCount = imgCount;
        return this;
    }

    public String getSharingLink() {
        return sharingLink;
    }

    public void setSharingLink(String sharingLink) {
        this.sharingLink = sharingLink;
    }

    public Car withSharingLink(String sharingLink) {
        this.sharingLink = sharingLink;
        return this;
    }

    public String getSharingMsgEn() {
        return sharingMsgEn;
    }

    public void setSharingMsgEn(String sharingMsgEn) {
        this.sharingMsgEn = sharingMsgEn;
    }

    public Car withSharingMsgEn(String sharingMsgEn) {
        this.sharingMsgEn = sharingMsgEn;
        return this;
    }

    public String getSharingMsgAr() {
        return sharingMsgAr;
    }

    public void setSharingMsgAr(String sharingMsgAr) {
        this.sharingMsgAr = sharingMsgAr;
    }

    public Car withSharingMsgAr(String sharingMsgAr) {
        this.sharingMsgAr = sharingMsgAr;
        return this;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Car withMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }

    public int getMakeID() {
        return makeID;
    }

    public void setMakeID(int makeID) {
        this.makeID = makeID;
    }

    public Car withMakeID(int makeID) {
        this.makeID = makeID;
        return this;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public Car withModelID(int modelID) {
        this.modelID = modelID;
        return this;
    }

    public int getBodyId() {
        return bodyId;
    }

    public void setBodyId(int bodyId) {
        this.bodyId = bodyId;
    }

    public Car withBodyId(int bodyId) {
        this.bodyId = bodyId;
        return this;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car withYear(int year) {
        this.year = year;
        return this;
    }

    public String getMakeEn() {
        return makeEn;
    }

    public void setMakeEn(String makeEn) {
        this.makeEn = makeEn;
    }

    public Car withMakeEn(String makeEn) {
        this.makeEn = makeEn;
        return this;
    }

    public String getMakeAr() {
        return makeAr;
    }

    public void setMakeAr(String makeAr) {
        this.makeAr = makeAr;
    }

    public Car withMakeAr(String makeAr) {
        this.makeAr = makeAr;
        return this;
    }

    public String getModelEn() {
        return modelEn;
    }

    public void setModelEn(String modelEn) {
        this.modelEn = modelEn;
    }

    public Car withModelEn(String modelEn) {
        this.modelEn = modelEn;
        return this;
    }

    public String getModelAr() {
        return modelAr;
    }

    public void setModelAr(String modelAr) {
        this.modelAr = modelAr;
    }

    public Car withModelAr(String modelAr) {
        this.modelAr = modelAr;
        return this;
    }

    public String getBodyEn() {
        return bodyEn;
    }

    public void setBodyEn(String bodyEn) {
        this.bodyEn = bodyEn;
    }

    public Car withBodyEn(String bodyEn) {
        this.bodyEn = bodyEn;
        return this;
    }

    public String getBodyAr() {
        return bodyAr;
    }

    public void setBodyAr(String bodyAr) {
        this.bodyAr = bodyAr;
    }

    public Car withBodyAr(String bodyAr) {
        this.bodyAr = bodyAr;
        return this;
    }

    public AuctionInfo getAuctionInfo() {
        return auctionInfo;
    }

    public void setAuctionInfo(AuctionInfo auctionInfo) {
        this.auctionInfo = auctionInfo;
    }

    public Car withAuctionInfo(AuctionInfo auctionInfo) {
        this.auctionInfo = auctionInfo;
        return this;
    }



    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(carID);
        dest.writeValue(image);
        dest.writeValue(descriptionAr);
        dest.writeValue(descriptionEn);
        dest.writeValue(imgCount);
        dest.writeValue(sharingLink);
        dest.writeValue(sharingMsgEn);
        dest.writeValue(sharingMsgAr);
        dest.writeValue(mileage);
        dest.writeValue(makeID);
        dest.writeValue(modelID);
        dest.writeValue(bodyId);
        dest.writeValue(year);
        dest.writeValue(makeEn);
        dest.writeValue(makeAr);
        dest.writeValue(modelEn);
        dest.writeValue(modelAr);
        dest.writeValue(bodyEn);
        dest.writeValue(bodyAr);
        dest.writeValue(auctionInfo);
    }

    public int describeContents() {
        return  0;
    }

}
