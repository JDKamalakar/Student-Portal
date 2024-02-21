package com.example.collegeportal;

public class NotificationDataClass {

    private int notificationTitle;
    
    private int notificationTime;

    private int notificationImage;

    public int getNotificationTitle() {

        return notificationTitle;
    }
    public int getNotificationImage() {

        return notificationImage;
    }
    public int getNotificationTime () {

        return notificationTime;
    }

    public NotificationDataClass(int notificationTitle, int notificationImage, int notificationTime) {
        this.notificationTitle = notificationTitle;
        this.notificationTime = notificationTime;
        this.notificationImage = notificationImage;
    }
}
