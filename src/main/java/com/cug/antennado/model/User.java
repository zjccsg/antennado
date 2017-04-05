package com.cug.antennado.model;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Date userCreate;

    private Date userLastModified;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Date getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Date userCreate) {
        this.userCreate = userCreate;
    }

    public Date getUserLastModified() {
        return userLastModified;
    }

    public void setUserLastModified(Date userLastModified) {
        this.userLastModified = userLastModified;
    }
}