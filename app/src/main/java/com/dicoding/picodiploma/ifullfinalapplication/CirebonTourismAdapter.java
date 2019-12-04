package com.dicoding.picodiploma.ifullfinalapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CirebonTourismAdapter extends RecyclerView.Adapter<CirebonTourismAdapter.CirebonTourismHolder>{
    private ArrayList<CirebonTourism> listTourism;
    public CirebonTourismAdapter(ArrayList<CirebonTourism> list) {
        this.listTourism = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CirebonTourismHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        return new CirebonTourismHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CirebonTourismHolder holder, int position) {
        CirebonTourism cirebonTourism = listTourism.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cirebonTourism.getPic())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPic);
        holder.tvName.setText(cirebonTourism.getName());
        holder.tvInfo.setText(cirebonTourism.getInfo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listTourism.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(CirebonTourism data);
    }

    @Override
    public int getItemCount() {
        return listTourism.size();
    }

    public class CirebonTourismHolder extends RecyclerView.ViewHolder {
        ImageView imgPic;
        TextView tvName, tvInfo;

        public CirebonTourismHolder(@NonNull View itemView) {
            super(itemView);

            imgPic = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvInfo = itemView.findViewById(R.id.tv_item_info);
        }
    }
}
