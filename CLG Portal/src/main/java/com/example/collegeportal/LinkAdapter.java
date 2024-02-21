package com.example.collegeportal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class LinkAdapter extends RecyclerView.Adapter<LinkViewHolder> {
    private Context context;
    private List<LinkDataClass> dataList;
    public LinkAdapter(Context context, List<LinkDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public LinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.link_view, parent, false);
        return new LinkViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull LinkViewHolder holder, int position) {
        holder.linkTitle.setText(dataList.get(position).getLinkTitle());

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class LinkViewHolder extends RecyclerView.ViewHolder{
    TextView linkTitle;
    CardView linkCard;
    public LinkViewHolder(@NonNull View itemView) {
        super(itemView);
        linkTitle = itemView.findViewById(R.id.linkTitle);
        linkCard = itemView.findViewById(R.id.linkCard);
    }
}
