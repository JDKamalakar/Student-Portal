package com.example.collegeportal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FeesAdapter extends RecyclerView.Adapter<FeesViewHolder> {

    private Context context;
    private List<FeesDataClass> dataList;

    private boolean isActivityPending;
    public FeesAdapter(Context context, List<FeesDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
        this.isActivityPending = isActivityPending;
    }
    @NonNull
    @Override
    public FeesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fees_view, parent, false);
        return new FeesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeesViewHolder holder, int position) {
        holder.feesTitle.setText(dataList.get(position).getFeesTitle());
        holder.feesAmount.setText(dataList.get(position).getFeesAmount());

        // Change text color and style based on current activity
        if (isActivityPending) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityPending ? R.color.pixelred : R.color.black));

            // set the GradientDrawable as the background of the TextView
            holder.feesStatus.setTextColor(ContextCompat.getColor(context,R.color.white));
            holder.feesStatus.setTypeface(Typeface.DEFAULT_BOLD);
            holder.feesStatus.setBackground(drawable);

        } else if (context instanceof FineActivity) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityPending ? R.color.white :R.color.pixelyellow));

            // set the GradientDrawable as the background of the TextView
            holder.feesStatus.setTypeface(Typeface.DEFAULT_BOLD);
            holder.feesStatus.setBackground(drawable);

            // set the text of the feesStatus TextView based on the current activity
            holder.feesStatus.setText(context.getString(R.string.Fine));

        } else if (context instanceof HistoryActivity) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityPending ? R.color.black : R.color.pixelblue));

            // set the GradientDrawable as the background of the TextView
            holder.feesStatus.setBackground(drawable);

            // set the text of the feesStatus TextView based on the current activity
            holder.feesStatus.setText(context.getString(R.string.Paid));

        } else if (context instanceof PayActivity) {

            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityPending ? R.color.black : R.color.pixelgreen));

            // set the GradientDrawable as the background of the TextView
            holder.feesStatus.setBackground(drawable);

            // set the text of the feesStatus TextView based on the current activity
            holder.feesStatus.setText(context.getString(R.string.Current));
        }

    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class FeesViewHolder extends RecyclerView.ViewHolder{
    TextView feesTitle, feesAmount, feesStatus;
    CardView fees_payCard;
    public FeesViewHolder(@NonNull View itemView) {
        super(itemView);
        feesTitle = itemView.findViewById(R.id.feesTitle);
        feesAmount = itemView.findViewById(R.id.feesAmount);
        fees_payCard = itemView.findViewById(R.id.fees_payCard);
        feesStatus = itemView.findViewById(R.id.feesStatus);
    }
}
