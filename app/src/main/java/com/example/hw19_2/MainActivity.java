package com.example.hw19_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GroupAdapter adapter;
    private ArrayList<String> groupList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_group);
        loadData();
        adapter = new GroupAdapter(groupList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        groupList.add("Байэл");
        groupList.add("Нурмухаммад");
        groupList.add("Дария");
        groupList.add("Дамир");
        groupList.add("Абдукерим");
        groupList.add("Ханифа");
        groupList.add("Мага");
        groupList.add("Нургазы");
        groupList.add("Ray Qiwi");
        groupList.add("Медер");
        groupList.add("Эмир");
    }
}