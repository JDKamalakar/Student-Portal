package com.example.collegeportal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QualificationAdapter extends RecyclerView.Adapter<QualificationViewHolder> {

    private Context context;
    private List<QualificationDataClass> dataList;

    public QualificationAdapter (Context context, List<QualificationDataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public QualificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_qualification, parent, false);
        return new QualificationViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull QualificationViewHolder holder, int position) {
        holder.eduMain.setText(dataList.get(position).getDataMain());
        holder.eduDegree.setText(dataList.get(position).getDataDegree());
        holder.nameExam.setText(dataList.get(position).getDataExam());
        holder.resultClass.setText(dataList.get(position).getDataClass());
        holder.eduBoard.setText(dataList.get(position).getDataBoard());
        holder.nameSchool.setText(dataList.get(position).getDataSchool());
        holder.passingYear.setText(dataList.get(position).getDataYear());
        holder.noSeat.setText(dataList.get(position).getDataSeat());
        holder.marksTotal.setText(dataList.get(position).getDataTotal());
        holder.obtainedMarks.setText(dataList.get(position).getDataMarks());
        holder.percentage.setText(dataList.get(position).getDataPercentage());
        holder.eduState.setText(dataList.get(position).getDataState());
        holder.eduCity.setText(dataList.get(position).getDataCity());
        holder.placeStudy.setText(dataList.get(position).getDataStudy());
        holder.eduLanguage.setText(dataList.get(position).getDataLanguage());
    };
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
class QualificationViewHolder extends RecyclerView.ViewHolder {
    TextView eduLanguage, placeStudy, eduCity, eduState, percentage, marksTotal, obtainedMarks, noSeat, passingYear, nameSchool, eduBoard, resultClass, nameExam, eduDegree, eduMain;
    CardView qualificationCard;

    public QualificationViewHolder(@NonNull View itemView) {
        super(itemView);
        eduLanguage = itemView.findViewById(R.id.eduLanguage);
        placeStudy = itemView.findViewById(R.id.placeStudy);
        eduCity = itemView.findViewById(R.id.eduCity);
        eduState = itemView.findViewById(R.id.eduState);
        percentage = itemView.findViewById(R.id.percentage);

        marksTotal = itemView.findViewById(R.id.marksTotal);
        obtainedMarks = itemView.findViewById(R.id.obtainedMarks);
        noSeat = itemView.findViewById(R.id.noSeat);
        passingYear = itemView.findViewById(R.id.passingYear);
        nameSchool = itemView.findViewById(R.id.nameSchool);
        eduBoard = itemView.findViewById(R.id.eduBoard);

        resultClass = itemView.findViewById(R.id.resultClass);
        nameExam = itemView.findViewById(R.id.nameExam);
        eduDegree = itemView.findViewById(R.id.eduDegree);
        eduMain = itemView.findViewById(R.id.eduMain);
    }
}