package com.example.belajarrecyle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collection;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FootballModel> footballModels;

    public FootballAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<FootballModel> getFootballModels() {
        return footballModels;
    }

    public void setFootballModels(ArrayList<FootballModel> footballModels) {
        this.footballModels = footballModels;
    }

    @NonNull
    @Override
    public FootballAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_footballl,viewGroup,false);
        return new ViewHolder(itemRow);
    }
    @Override
    public void onBindViewHolder(@NonNull FootballAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getFootballModels().get(i).getLambangTeam()).into(viewHolder.ivLambangTeam);
        viewHolder.tvNamateam.setText(getFootballModels().get(i).getNamaTeam());
    }
    @Override
    public int getItemCount() {
        return getFootballModels().size();

    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangTeam;
        private TextView tvNamateam;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLambangTeam = itemView.findViewById(R.id.IV_1);
            tvNamateam = itemView.findViewById(R.id.TV_1);
        }

    }

}
