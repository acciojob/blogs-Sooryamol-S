package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn
    @ManyToOne
    private Blog blog;
    private String dimensions;
    private String description;

    public Image( Blog blog, String dimensions,String description) {
        this.blog = blog;
        this.dimensions = dimensions;
        this.description=description;
    }

    public Image() {
        this.blog=null;
        this.dimensions=null;
        this.description=null;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions= dimensions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}