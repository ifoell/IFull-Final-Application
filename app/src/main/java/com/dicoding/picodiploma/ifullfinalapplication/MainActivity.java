package com.dicoding.picodiploma.ifullfinalapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                title = "List Pariwisata Cirebon";
                break;
            case R.id.about:
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
        }
        setActionBarTitle(title);
    }
}
