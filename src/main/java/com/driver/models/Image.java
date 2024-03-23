package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer imageId;

    @JoinColumn
    @ManyToOne
    private Blog blog;
    private String dimension;
    private String description;

    public Image( Blog blog, String dimension,String description) {
        this.blog = blog;
        this.dimension = dimension;
        this.description=description;
    }

    public Image() {
        this.blog=null;
        this.dimension=null;
        this.description=null;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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