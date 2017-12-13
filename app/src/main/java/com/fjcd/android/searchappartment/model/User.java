package com.fjcd.android.searchappartment.model;

import java.io.Serializable;

/**
 * Created by Fernando on 12/13/2017.
 */

public class User implements Serializable{
    private long id;
    private String username;
    private Boolean isPublisher;
    private String photo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getPublisher() {
        return isPublisher;
    }

    public void setPublisher(Boolean publisher) {
        isPublisher = publisher;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
