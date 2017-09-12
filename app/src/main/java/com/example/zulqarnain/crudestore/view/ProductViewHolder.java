package com.example.zulqarnain.crudestore.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zulqarnain.crudestore.R;
import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Zul Qarnain on 9/9/2017.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {
    public TextView pTitle;
    public ImageView pImage;
    public ProductViewHolder(View itemView) {
        super(itemView);
        pTitle= (TextView) itemView.findViewById(R.id.product_name);
        pImage= (ImageView) itemView.findViewById(R.id.product_image);

    }

    public  void bindView(Products products, ArrayList<ProductImages> imgList, Context context){
        String path=null;
        for(int i=0;i<imgList.size();i++){
                if(imgList.get(i).getPid()==products.getPid()){
                    path=imgList.get(i).getPath();
                }
            }
        Picasso.with(context).load("https://laindain.000webhostapp.com/visitors//images/"+path).into(pImage);
        pTitle.setText(products.getProductName());
    }
}
