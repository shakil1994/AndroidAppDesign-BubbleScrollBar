package com.example.shakil.androidbubblescrollbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shakil.androidbubblescrollbar.Adapter.MyAdapter;
import com.trendyol.bubblescrollbarlib.BubbleScrollBar;
import com.trendyol.bubblescrollbarlib.BubbleTextProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listData = new ArrayList<>();
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    BubbleScrollBar scrollBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, layoutManager.getOrientation()));

        initData();

        Collections.sort(listData);
        recyclerView.setAdapter(new MyAdapter(listData));

        scrollBar = findViewById(R.id.bubble_scroll);
        scrollBar.attachToRecyclerView(recyclerView);
        scrollBar.setBubbleTextProvider(new BubbleTextProvider() {
            @Override
            public String provideBubbleText(int i) {
                return new StringBuilder(listData.get(i).substring(0, 1)).toString();
            }
        });
    }

    private void initData() {

        listData.add("Arnob");
        listData.add("Anondita");
        listData.add("Anas");
        listData.add("Anis");
        listData.add("Afzal");

        listData.add("Shakil");
        listData.add("Shuvo");
        listData.add("Shanti");
        listData.add("Sumiya");
        listData.add("Shrabonty");

        listData.add("Kamrul");
        listData.add("Korim");
        listData.add("Kamal");
        listData.add("Kemi");
        listData.add("Kanta");

        listData.add("Tanmoy");
        listData.add("Tanha");
        listData.add("Tomal");
        listData.add("Tom");
        listData.add("Tapos");

        listData.add("Nishan");
        listData.add("Nowrin");
        listData.add("Nadia");
        listData.add("Nabila");
        listData.add("Nowsin");

        listData.add("Rima");
        listData.add("Rohim");
        listData.add("Rebeka");
        listData.add("Rabbi");
        listData.add("Rohima");

        listData.add("Mimi");
        listData.add("Mitu");
        listData.add("Mizan");
        listData.add("Minhaj");
        listData.add("Mitul");

        listData.add("Limu");
        listData.add("Liton");
        listData.add("Lima");
        listData.add("Lamiya");
        listData.add("Lamima");
    }
}
