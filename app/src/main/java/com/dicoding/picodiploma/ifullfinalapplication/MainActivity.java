package com.dicoding.picodiploma.ifullfinalapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTourism;
    private ArrayList<CirebonTourism> list = new ArrayList<>();
    private String title = "List Pariwisata Cirebon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvTourism = findViewById(R.id.rv_list_tourism);
        rvTourism.setHasFixedSize(true);

        list.addAll(CirebonTourismData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvTourism.setLayoutManager(new LinearLayoutManager(this));
        CirebonTourismAdapter cirebonTourismAdapter = new CirebonTourismAdapter(list);
        rvTourism.setAdapter(cirebonTourismAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
