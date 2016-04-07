package com.sallerbaba.paymentportel;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Choudhary on 07-Apr-16.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private List<ItemList> itemList;

    public ItemAdapter(List<ItemList> itemList) {
        this.itemList = itemList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ItemList item = itemList.get(position);
        holder.i_name.setText(item.getI_name());
        holder.rate.setText(item.getRate());
        holder.discription.setText(item.getDiscription());
        holder.size.setText(item.getSize());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView i_name, rate, discription, size;

        public MyViewHolder(View view) {
            super(view);
            i_name = (TextView) view.findViewById(R.id.tv_itmname);
            rate = (TextView) view.findViewById(R.id.tv_rate);
            discription = (TextView) view.findViewById(R.id.tv_decription);
            size = (TextView) view.findViewById(R.id.tv_size);
        }
    }
}