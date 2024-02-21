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

public class LibraryAdapter extends RecyclerView.Adapter<LibraryViewHolder> {

    private Context context;
    private List<LibraryDataClass> dataList;
    private boolean isActivityDue; // flag to check if the current activity is ActivityDue

    public LibraryAdapter(Context context, List<LibraryDataClass> dataList, boolean isActivityDue) {
        this.context = context;
        this.dataList = dataList;
        this.isActivityDue = isActivityDue;
    }

    @NonNull
    @Override
    public LibraryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.library_cards_view, parent, false);
        return new LibraryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibraryViewHolder holder, int position) {
        holder.bookTitle.setText(dataList.get(position).getBookTitle());
        holder.bookDate.setText(dataList.get(position).getBookDate());

        // Change text color and style based on current activity
        if (isActivityDue) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityDue ? R.color.pixelred : R.color.black));
            drawable.setCornerRadius(16);

            // set the GradientDrawable as the background of the TextView
            holder.bookDate.setTextColor(ContextCompat.getColor(context,R.color.white));
            holder.bookDate.setTypeface(Typeface.DEFAULT_BOLD);
            holder.bookDate.setBackground(drawable);

        } else if (context instanceof RequestActivity) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityDue ? R.color.white :R.color.pixelyellow));
            drawable.setCornerRadius(16);

            // set the GradientDrawable as the background of the TextView
            holder.bookDate.setTypeface(Typeface.DEFAULT_BOLD);
            holder.bookDate.setBackground(drawable);

        } else if (context instanceof IssuedHistoryActivity) {

            // create a new GradientDrawable with the desired background color and rounded corners
            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityDue ? R.color.black : R.color.pixelblue));
            drawable.setCornerRadius(16);

            // set the GradientDrawable as the background of the TextView
            holder.bookDate.setBackground(drawable);

        } else if (context instanceof IssuedActivity) {

            GradientDrawable drawable = new GradientDrawable();
            drawable.setShape(GradientDrawable.RECTANGLE);
            drawable.setColor(ContextCompat.getColor(context, isActivityDue ? R.color.black : R.color.pixelgreen));
            drawable.setCornerRadius(16);

            // set the GradientDrawable as the background of the TextView
            holder.bookDate.setBackground(drawable);

        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

class LibraryViewHolder extends RecyclerView.ViewHolder {
    TextView bookTitle, bookDate;
    CardView bookCard;

    public LibraryViewHolder(@NonNull View itemView) {
        super(itemView);
        bookTitle = itemView.findViewById(R.id.bookTitle);
        bookDate = itemView.findViewById(R.id.bookDate);
        bookCard = itemView.findViewById(R.id.bookCard);
    }
}
