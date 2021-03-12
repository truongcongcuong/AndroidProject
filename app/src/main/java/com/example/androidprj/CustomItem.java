package com.example.androidprj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomItem extends BaseAdapter {

    Context context;
    int layoutItem;
    ArrayList<Item> arrayList;
    public CustomItem(Context context , int layoutItem, ArrayList<Item> arrayList){
        this.context = context;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(layoutItem,parent,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        ImageView imageView = view.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(position).getItemName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imageView.setImageResource(arrayList.get(position).getImage());

        return view;
    }
}
