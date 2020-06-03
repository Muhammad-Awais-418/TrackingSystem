package com.xyz.trackingsystem.Model;

import java.util.HashMap;

public class User {

    private String uid, email;
    private HashMap<String, User> acceptlist;  //List user Friends

    public User(String uid,String email){
        this.uid = uid;
        this.email = email;
        acceptlist = new HashMap<>();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, User> getAcceptlist() {
        return acceptlist;
    }

    public void setAcceptlist(HashMap<String, User> acceptlist) {
        this.acceptlist = acceptlist;
    }
}
