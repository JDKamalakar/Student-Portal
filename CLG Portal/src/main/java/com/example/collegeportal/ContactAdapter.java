package com.example.collegeportal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private Context context;
    private List<ContactDataClass> dataList;
    public void setSearchList(List<ContactDataClass> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }
    public ContactAdapter(Context context, List<ContactDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_contact, parent, false);
        return new ContactViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.listImage.setImageResource(dataList.get(position).getListImage());
        holder.listName.setText(dataList.get(position).getListName());
        holder.contactCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailedActivityContact.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getListImage());
                intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getListName());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class ContactViewHolder extends RecyclerView.ViewHolder{
    ImageView listImage;
    TextView listName;
    CardView contactCard;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        listName = itemView.findViewById(R.id.listName);
        listImage = itemView.findViewById(R.id.listImage);
        contactCard = itemView.findViewById(R.id.contactCard);
    }
}