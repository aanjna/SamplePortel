package com.sallerbaba.paymentportel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ItemList> itemList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ItemAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv_listitem);

        mAdapter = new ItemAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();
    }

    private void prepareData() {
        ItemList itemlist = new ItemList("Rani", "350", "bjh bfuvbfu this is de", "8");itemList.add(itemlist);
        itemlist = new ItemList("Rani", "350", "bjh bfuvbfu this is de", "8");itemList.add(itemlist);
        itemlist = new ItemList("Rani", "350", "bjh bfuvbfu this is de", "8");itemList.add(itemlist);
        itemlist = new ItemList("Rani", "350", "bjh bfuvbfu this is de", "8");itemList.add(itemlist);
        itemlist = new ItemList("Rani", "350", "bjh bfuvbfu this is de", "8");
        itemList.add(itemlist);
    }
}
