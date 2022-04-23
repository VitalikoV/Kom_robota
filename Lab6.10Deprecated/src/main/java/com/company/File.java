package com.company;

import java.util.Date;

public class File {
    private String name;
    private Date createdDate;
    private int viewsQuantity;

    public File(String name, Date createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getName() {
        viewsQuantity++;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getViewsQuantity() {
        return viewsQuantity;
    }
}
