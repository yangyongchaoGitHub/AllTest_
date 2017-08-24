package com.agivision.alltest.model;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by agileo on 2015-09-24.
 *
 */
public abstract class Entity extends SugarRecord implements Serializable{
    private Long uid;
    private String name;
    private String category;
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Entity() {
        uid = (long)-1;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long id) {
        this.uid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
