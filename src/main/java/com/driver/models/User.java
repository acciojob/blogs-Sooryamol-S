package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user,cascade=CascadeType.all")

    private List<Image> blogList=new ArrayList<>();

    public List<Image> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Image> blogList) {
        this.blogList = blogList;
    }

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }


    public User(){
        this.username=null;
        this.password=null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}