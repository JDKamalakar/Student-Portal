package com.example.collegeportal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapterNotification extends RecyclerView.Adapter<NotificationViewHolder> {
    private Context context;
    private List<NotificationDataClass> dataList;

    public ListAdapterNotification(Context context, List<NotificationDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.active_notification, parent, false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        holder.notificationTitle.setText(dataList.get(position).getNotificationTitle());
        holder.notificationTime.setText(dataList.get(position).getNotificationTime());

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class NotificationViewHolder extends RecyclerView.ViewHolder{
    TextView notificationTitle, notificationTime;

    ImageView notificationImage;
    CardView notificationCard;
    public NotificationViewHolder(@NonNull View itemView) {
        super(itemView);
        notificationTitle = itemView.findViewById(R.id.notificationTitle);
        notificationTime = itemView.findViewById(R.id.notificationTime);
        notificationCard = itemView.findViewById(R.id.notificationCard);
    }
}