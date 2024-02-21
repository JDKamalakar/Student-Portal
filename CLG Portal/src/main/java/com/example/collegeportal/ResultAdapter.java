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

public class ResultAdapter extends RecyclerView.Adapter<ResultViewHolder> {
    private Context context;
    private List<ResultDataClass> dataList;
    public ResultAdapter(Context context, List<ResultDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sem_wise_result, parent, false);
        return new ResultViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
        holder.semNumber.setText(dataList.get(position).getSemNumber());
        holder.sgpaNumber.setText(dataList.get(position).getSgpaNumber());
        holder.blNumber.setText(dataList.get(position).getBlNumber());

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class ResultViewHolder extends RecyclerView.ViewHolder{
    TextView semNumber;
    TextView sgpaNumber;
    TextView blNumber;
    CardView resultCard;
    public ResultViewHolder(@NonNull View itemView) {
        super(itemView);
        semNumber = itemView.findViewById(R.id.semNumber);
        sgpaNumber = itemView.findViewById(R.id.sgpaNumber);
        blNumber = itemView.findViewById(R.id.blNumber);
        resultCard = itemView.findViewById(R.id.resultCard);
    }
}
