package com.example.collegeportal;

public class FeesDataClass {
    private int feesTitle;

    private int feesAmount;

    private int feesStatus;


    public int getFeesTitle() {

        return feesTitle;
    }

    public int getFeesAmount() {

        return feesAmount;
    }

    public int getFeesStatus() {
        return feesStatus;
    }

    public FeesDataClass(int feesTitle, int feesAmount) {
        this.feesTitle = feesTitle;
        this.feesAmount = feesAmount;
        this.feesStatus = feesStatus;
    }
}
