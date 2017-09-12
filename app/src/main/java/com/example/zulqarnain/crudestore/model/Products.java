package com.example.zulqarnain.crudestore.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public class Products {
    @SerializedName("pid")
    private int pid;

    @SerializedName("p_name")
    private String productName;

    @SerializedName("date")
    private String  prodDate;

    @SerializedName("price")
    private String  prodPrice;

    @SerializedName("location")
    private String  prodLocation;

    @SerializedName("type")
    private String  prodType;

    @SerializedName("user_name")
    private String  prodOwner;

    @SerializedName("description")
    private String  prodDescription;



    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPid() {
        return pid;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getProdOwner() {
        return prodOwner;
    }

    public void setProdOwner(String prodOwner) {
        this.prodOwner = prodOwner;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdLocation() {
        return prodLocation;
    }

    public void setProdLocation(String prodLocation) {
        this.prodLocation = prodLocation;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDate() {
        return prodDate;
    }

    public void setProdDate(String prodDate) {
        this.prodDate = prodDate;
    }
}
