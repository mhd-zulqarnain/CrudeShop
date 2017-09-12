package com.example.zulqarnain.crudestore.interfaces;

import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public interface ApiInterface {

    @GET("getproducts.php")
    Call<ArrayList<Products>> getProducts();

        @GET("getProductImages.php")
    Call<ArrayList<ProductImages>> getImages();
}
