package com.internalPractice.APIFindPets.entities;

import java.util.Date;

public class Post {
    private String id;
    private String title;
    private String description;
    private User user;
    private Date date;

    public Post (){

    }

    public Post(String id, String title, String description, User user, Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user = user;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
