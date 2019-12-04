package com.dicoding.picodiploma.ifullfinalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        ImageView imageTourism = findViewById( R.id.image_detail );
        TextView tvTourism = findViewById( R.id.nama_pariwisata );
        TextView tvDetail = findViewById( R.id.detail_pariwisata );

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            int imgId = bundle.getInt(EXTRA_IMG);
            imageTourism.setImageResource( imgId );
        }
        String name = getIntent().getStringExtra( EXTRA_NAME );
        tvTourism.setText( name );
        String detail = getIntent().getStringExtra( EXTRA_DETAIL );
        tvDetail.setText( detail );
        setTitle( name );

    }
}
