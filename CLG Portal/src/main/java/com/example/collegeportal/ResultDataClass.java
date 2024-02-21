package com.example.collegeportal;

public class ResultDataClass {

    private int semNumber;

    private int sgpaNumber;

    private int blNumber;


    public int getSemNumber() {

        return semNumber;
    }

    public int getSgpaNumber() {

        return sgpaNumber;
    }

    public int getBlNumber() {

        return blNumber;
    }

    public ResultDataClass(int semNumber, int sgpaNumber, int blNumber) {
        this.semNumber = semNumber;
        this.sgpaNumber = sgpaNumber;
        this.blNumber = blNumber;
    }
}