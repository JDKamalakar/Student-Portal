package com.example.collegeportal;

public class LibraryDataClass {
    private int bookTitle;

    private int bookDate;


    public int getBookTitle() {

        return bookTitle;
    }

    public int getBookDate() {
        return bookDate;
    }

    public LibraryDataClass(int bookTitle, int bookDate) {
        this.bookTitle = bookTitle;
        this.bookDate = bookDate;
    }
}
