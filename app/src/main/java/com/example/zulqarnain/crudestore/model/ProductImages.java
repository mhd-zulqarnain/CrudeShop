package com.example.zulqarnain.crudestore.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Zul Qarnain on 9/11/2017.
 */

public class ProductImages {
    @SerializedName("pid")
    private int pid;
    @SerializedName("path")
    private String path;

    public int getPid() {
        return pid;
    }

    public String getPath() {
        return path;
    }
}
