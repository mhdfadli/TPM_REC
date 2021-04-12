package com.example.belajarrecyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTeam;
    private ArrayList<FootballModel> listTeam = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTeam = findViewById(R.id.rv_teamlist);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(FootballData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        FootballAdapter footbalAdapter = new FootballAdapter(this);
        footbalAdapter.setFootballModels(listTeam);
        rvTeam.setAdapter(footbalAdapter);
    }
}