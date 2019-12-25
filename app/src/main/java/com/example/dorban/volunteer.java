package com.example.dorban;

public class volunteer {

    private String uid;
    private String fname;
    private String lname;
    private String phone;
    private boolean is_manager;
    private int vol_currency;
    private int social_currency;
    private String Facebook_username;
    private String Facebook_password;

    public volunteer(String uid, String fname, String lname, String phone, boolean is_manager, int vol_currency, int social_currency, String facebook_username, String facebook_password) {
        this.uid = uid;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.is_manager = is_manager;
        this.vol_currency = vol_currency;
        this.social_currency = social_currency;
        Facebook_username = facebook_username;
        Facebook_password = facebook_password;
    }

    public String getUid() {
        return uid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isIs_manager() {
        return is_manager;
    }

    public int getVol_currency() {
        return vol_currency;
    }

    public int getSocial_currency() {
        return social_currency;
    }

    public String getFacebook_username() {
        return Facebook_username;
    }

    public String getFacebook_password() {
        return Facebook_password;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setIs_manager(boolean is_manager) {
        this.is_manager = is_manager;
    }

    public void setVol_currency(int vol_currency) {
        this.vol_currency = vol_currency;
    }

    public void setSocial_currency(int social_currency) {
        this.social_currency = social_currency;
    }

    public void setFacebook_username(String facebook_username) {
        Facebook_username = facebook_username;
    }

    public void setFacebook_password(String facebook_password) {
        Facebook_password = facebook_password;
    }
}
