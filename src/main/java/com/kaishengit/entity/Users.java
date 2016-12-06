package com.kaishengit.entity;

/**
 * Created by sunny on 2016/12/5.
 */
public class Users {
   private Integer id;
   private String userName;
   private String address;

    public Users(){}

    public Users(Integer id, String userName, String address) {
        this.id = id;
        this.userName = userName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
