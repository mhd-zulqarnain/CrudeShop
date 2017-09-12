package com.example.zulqarnain.crudestore.controller;

import android.util.Log;
import android.widget.Toast;

import com.example.zulqarnain.crudestore.MainActivity;
import com.example.zulqarnain.crudestore.interfaces.ApiInterface;
import com.example.zulqarnain.crudestore.interfaces.Communicator;
import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public class ShopLab implements Callback{


    private static ShopLab shopLab;
    private Communicator communicator;
    private  ArrayList<Products> list=null;
    private  ArrayList<ProductImages> imglist=null;

    public ShopLab(){
        ApiInterface apiInterface = ApiClint.getApiClint().create(ApiInterface.class);
        Call<ArrayList<Products>> call = apiInterface.getProducts();
        Call<ArrayList<ProductImages>> callp= apiInterface.getImages();
        call.enqueue(this);
        callp.enqueue(this);
    }

    /*public List<Products> getProducts(){
        return list;
    }*/
    public void setCommunicator(Communicator communicator) {

        this.communicator = communicator;
    }


    @Override
    public void onResponse(Call call, Response response) {

        if((response.raw().request().url().toString()).equals("http://10.0.3.2/trade/getproducts.php")){
            list = (ArrayList<Products>) response.body();
        }
        if((response.raw().request().url().toString()).equals("http://10.0.3.2/trade/getProductImages.php")){
            imglist = (ArrayList<ProductImages>) response.body();
        }

        if(list!=null && imglist!=null){
            communicator.getProducts(list,imglist);
        }

    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
