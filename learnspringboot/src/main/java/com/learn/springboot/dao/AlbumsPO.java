package com.learn.springboot.dao;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/5
 */
@Entity
@Table(name = "albums")
public class AlbumsPO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String album;

    @Column
    private Date publishDate;

    @Column
    private Date dateTime;

    protected AlbumsPO(){

    }

    public AlbumsPO(String album, Date publishDate){
        this.album = album;
        this.publishDate = publishDate;
        this.dateTime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
