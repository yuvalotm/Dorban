package com.example.dorban;

import java.sql.Date;

public class Event {
    private int id;
    private String Date;
    private int duration;
    private int NumberOfCurrentUsers;
    private int NumberOfMaxUsers;
    private String info;
    private String Location;
    private String ContactPhoneNumber;
    private String ContactName;
    private String nameEvent;

    public Event(int id, String date, int duration, int numberOfCurrentUsers, int numberOfMaxUsers,
                 String info, String location, String contactPhoneNumber, String contactName) {
        this.id = id;
        Date = date;
        this.duration = duration;
        NumberOfCurrentUsers = numberOfCurrentUsers;
        NumberOfMaxUsers = numberOfMaxUsers;
        this.info = info;
        Location = location;
        ContactPhoneNumber = contactPhoneNumber;
        ContactName = contactName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setNumberOfCurrentUsers(int numberOfCurrentUsers) {
        NumberOfCurrentUsers = numberOfCurrentUsers;
    }

    public void setNumberOfMaxUsers(int numberOfMaxUsers) {
        NumberOfMaxUsers = numberOfMaxUsers;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        ContactPhoneNumber = contactPhoneNumber;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return Date;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumberOfCurrentUsers() {
        return NumberOfCurrentUsers;
    }

    public int getNumberOfMaxUsers() {
        return NumberOfMaxUsers;
    }

    public String getInfo() {
        return info;
    }

    public String getLocation() {
        return Location;
    }

    public String getContactPhoneNumber() {
        return ContactPhoneNumber;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getContactName() {
        return ContactName;
    }
}
