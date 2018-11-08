package com.learn.springboot.dao;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/5
 */
@Entity
@Table(name = "songs")
public class SongsPO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column
    private Float length;

    @Column
    private Date dateTime;

    protected SongsPO(){}

    public SongsPO(String title, Float length){
        this.title = title;
        this.length = length;
        this.dateTime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
