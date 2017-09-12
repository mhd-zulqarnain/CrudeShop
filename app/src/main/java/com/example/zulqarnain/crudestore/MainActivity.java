package com.example.zulqarnain.crudestore;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zulqarnain.crudestore.controller.ProductRecycler;
import com.example.zulqarnain.crudestore.controller.ShopLab;
import com.example.zulqarnain.crudestore.interfaces.Communicator;
import com.example.zulqarnain.crudestore.model.ProductImages;
import com.example.zulqarnain.crudestore.model.Products;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements Communicator {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.prod_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ShopLab shopLab = new ShopLab();
        shopLab.setCommunicator(this);

    }

    @Override
    public void getProducts(ArrayList<Products> products,ArrayList<ProductImages> images) {
//        textView.setText(products.get(0).getProductName());
        recyclerView.setAdapter(new ProductRecycler(products,images));
        Toast.makeText(MainActivity.this,"the testong "+products.size()+" img"+images.size(),Toast.LENGTH_LONG);
    }


}
