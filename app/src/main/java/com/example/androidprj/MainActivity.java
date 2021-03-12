package com.example.androidprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listViewItem;
    CustomItem customItem;
    ArrayList<Item> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewItem = findViewById(R.id.lvItem);
        arrayList = new ArrayList<>();
        arrayList.add(new Item("Google","80$",R.drawable.google));
        arrayList.add(new Item("Google","80$",R.drawable.google));
        arrayList.add(new Item("Google","80$",R.drawable.google));
        arrayList.add(new Item("Google","80$",R.drawable.google));

        customItem = new CustomItem(this,R.layout.list_view,arrayList);

        listViewItem.setAdapter(customItem);

    }
}