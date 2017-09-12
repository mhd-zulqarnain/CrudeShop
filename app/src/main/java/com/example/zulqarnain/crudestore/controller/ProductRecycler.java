package com.example.zulqarnain.crudestore.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.zulqarnain.crudestore.R;
import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;
import com.example.zulqarnain.crudestore.view.ProductViewHolder;

import java.util.ArrayList;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public class ProductRecycler extends RecyclerView.Adapter<ProductViewHolder> {
    private ArrayList<Products> productList;
    private ArrayList<ProductImages> productImagesList;
    Context context;
   public ProductRecycler(ArrayList<Products> productList, ArrayList<ProductImages> images) {
        this.productList=productList;
       this.productImagesList=images;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ProductViewHolder productViewHolder = new ProductViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.single_product_view, parent, false));
        context= parent.getContext();
        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Products products = productList.get(position);

        holder.bindView(products,productImagesList,context);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
