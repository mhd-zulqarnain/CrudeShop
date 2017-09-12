package com.example.zulqarnain.crudestore.interfaces;

import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;

import java.util.ArrayList;

/**
 * Created by Zul Qarnain on 8/29/2017.
 */

public interface Communicator {
    public  void getProducts(ArrayList<Products> products,ArrayList<ProductImages> images);
}
