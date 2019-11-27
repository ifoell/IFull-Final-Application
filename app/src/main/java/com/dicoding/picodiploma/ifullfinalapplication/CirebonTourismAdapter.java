package com.dicoding.picodiploma.ifullfinalapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CirebonTourismAdapter extends RecyclerView.Adapter<CirebonTourismAdapter.CirebonTourismHolder> {
    private ArrayList<CirebonTourism> listTourism;
    public CirebonTourismAdapter(ArrayList<CirebonTourism> list) {
        this.listTourism = list;
    }

    @NonNull
    @Override
    public CirebonTourismHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        return new CirebonTourismHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CirebonTourismHolder holder, int position) {
        CirebonTourism cirebonTourism = listTourism.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cirebonTourism.getPic())
                .apply(new RequestOptions().override(55,55))
                .into(holder.)
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CirebonTourismHolder {
    }
}
