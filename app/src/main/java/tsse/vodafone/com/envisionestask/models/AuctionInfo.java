package tsse.vodafone.com.envisionestask.models;


import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AuctionInfo implements Serializable, Parcelable
{

    @SerializedName("bids")
    @Expose
    private int bids;
    @SerializedName("endDate")
    @Expose
    private int endDate;
    @SerializedName("endDateEn")
    @Expose
    private String endDateEn;
    @SerializedName("endDateAr")
    @Expose
    private String endDateAr;
    @SerializedName("currencyEn")
    @Expose
    private String currencyEn;
    @SerializedName("currencyAr")
    @Expose
    private String currencyAr;
    @SerializedName("currentPrice")
    @Expose
    private int currentPrice;
    @SerializedName("minIncrement")
    @Expose
    private int minIncrement;
    @SerializedName("lot")
    @Expose
    private int lot;
    @SerializedName("priority")
    @Expose
    private int priority;
    @SerializedName("VATPercent")
    @Expose
    private int vATPercent;
    @SerializedName("isModified")
    @Expose
    private int isModified;
    @SerializedName("itemid")
    @Expose
    private int itemid;
    @SerializedName("iCarId")
    @Expose
    private int iCarId;
    @SerializedName("iVinNumber")
    @Expose
    private String iVinNumber;
    public final static Parcelable.Creator<AuctionInfo> CREATOR = new Creator<AuctionInfo>() {


        @SuppressWarnings({
                "unchecked"
        })
        public AuctionInfo createFromParcel(Parcel in) {
            return new AuctionInfo(in);
        }

        public AuctionInfo[] newArray(int size) {
            return (new AuctionInfo[size]);
        }

    }
            ;
    private final static long serialVersionUID = 8398180181888835423L;

    protected AuctionInfo(Parcel in) {
        this.bids = ((int) in.readValue((int.class.getClassLoader())));
        this.endDate = ((int) in.readValue((int.class.getClassLoader())));
        this.endDateEn = ((String) in.readValue((String.class.getClassLoader())));
        this.endDateAr = ((String) in.readValue((String.class.getClassLoader())));
        this.currencyEn = ((String) in.readValue((String.class.getClassLoader())));
        this.currencyAr = ((String) in.readValue((String.class.getClassLoader())));
        this.currentPrice = ((int) in.readValue((int.class.getClassLoader())));
        this.minIncrement = ((int) in.readValue((int.class.getClassLoader())));
        this.lot = ((int) in.readValue((int.class.getClassLoader())));
        this.priority = ((int) in.readValue((int.class.getClassLoader())));
        this.vATPercent = ((int) in.readValue((int.class.getClassLoader())));
        this.isModified = ((int) in.readValue((int.class.getClassLoader())));
        this.itemid = ((int) in.readValue((int.class.getClassLoader())));
        this.iCarId = ((int) in.readValue((int.class.getClassLoader())));
        this.iVinNumber = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public AuctionInfo() {
    }

    /**
     *
     * @param iVinNumber
     * @param endDateAr
     * @param isModified
     * @param endDateEn
     * @param vATPercent
     * @param minIncrement
     * @param bids
     * @param endDate
     * @param currencyEn
     * @param currentPrice
     * @param itemid
     * @param priority
     * @param iCarId
     * @param currencyAr
     * @param lot
     */
    public AuctionInfo(int bids, int endDate, String endDateEn, String endDateAr, String currencyEn, String currencyAr, int currentPrice, int minIncrement, int lot, int priority, int vATPercent, int isModified, int itemid, int iCarId, String iVinNumber) {
        super();
        this.bids = bids;
        this.endDate = endDate;
        this.endDateEn = endDateEn;
        this.endDateAr = endDateAr;
        this.currencyEn = currencyEn;
        this.currencyAr = currencyAr;
        this.currentPrice = currentPrice;
        this.minIncrement = minIncrement;
        this.lot = lot;
        this.priority = priority;
        this.vATPercent = vATPercent;
        this.isModified = isModified;
        this.itemid = itemid;
        this.iCarId = iCarId;
        this.iVinNumber = iVinNumber;
    }

    public int getBids() {
        return bids;
    }

    public void setBids(int bids) {
        this.bids = bids;
    }

    public AuctionInfo withBids(int bids) {
        this.bids = bids;
        return this;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public AuctionInfo withEndDate(int endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getEndDateEn() {
        return endDateEn;
    }

    public void setEndDateEn(String endDateEn) {
        this.endDateEn = endDateEn;
    }

    public AuctionInfo withEndDateEn(String endDateEn) {
        this.endDateEn = endDateEn;
        return this;
    }

    public String getEndDateAr() {
        return endDateAr;
    }

    public void setEndDateAr(String endDateAr) {
        this.endDateAr = endDateAr;
    }

    public AuctionInfo withEndDateAr(String endDateAr) {
        this.endDateAr = endDateAr;
        return this;
    }

    public String getCurrencyEn() {
        return currencyEn;
    }

    public void setCurrencyEn(String currencyEn) {
        this.currencyEn = currencyEn;
    }

    public AuctionInfo withCurrencyEn(String currencyEn) {
        this.currencyEn = currencyEn;
        return this;
    }

    public String getCurrencyAr() {
        return currencyAr;
    }

    public void setCurrencyAr(String currencyAr) {
        this.currencyAr = currencyAr;
    }

    public AuctionInfo withCurrencyAr(String currencyAr) {
        this.currencyAr = currencyAr;
        return this;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public AuctionInfo withCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public int getMinIncrement() {
        return minIncrement;
    }

    public void setMinIncrement(int minIncrement) {
        this.minIncrement = minIncrement;
    }

    public AuctionInfo withMinIncrement(int minIncrement) {
        this.minIncrement = minIncrement;
        return this;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public AuctionInfo withLot(int lot) {
        this.lot = lot;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public AuctionInfo withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public int getVATPercent() {
        return vATPercent;
    }

    public void setVATPercent(int vATPercent) {
        this.vATPercent = vATPercent;
    }

    public AuctionInfo withVATPercent(int vATPercent) {
        this.vATPercent = vATPercent;
        return this;
    }

    public int getIsModified() {
        return isModified;
    }

    public void setIsModified(int isModified) {
        this.isModified = isModified;
    }

    public AuctionInfo withIsModified(int isModified) {
        this.isModified = isModified;
        return this;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public AuctionInfo withItemid(int itemid) {
        this.itemid = itemid;
        return this;
    }

    public int getICarId() {
        return iCarId;
    }

    public void setICarId(int iCarId) {
        this.iCarId = iCarId;
    }

    public AuctionInfo withICarId(int iCarId) {
        this.iCarId = iCarId;
        return this;
    }

    public String getIVinNumber() {
        return iVinNumber;
    }

    public void setIVinNumber(String iVinNumber) {
        this.iVinNumber = iVinNumber;
    }

    public AuctionInfo withIVinNumber(String iVinNumber) {
        this.iVinNumber = iVinNumber;
        return this;
    }



    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(bids);
        dest.writeValue(endDate);
        dest.writeValue(endDateEn);
        dest.writeValue(endDateAr);
        dest.writeValue(currencyEn);
        dest.writeValue(currencyAr);
        dest.writeValue(currentPrice);
        dest.writeValue(minIncrement);
        dest.writeValue(lot);
        dest.writeValue(priority);
        dest.writeValue(vATPercent);
        dest.writeValue(isModified);
        dest.writeValue(itemid);
        dest.writeValue(iCarId);
        dest.writeValue(iVinNumber);
    }

    public int describeContents() {
        return  0;
    }

}
