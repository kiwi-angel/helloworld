package com.learn.springboot.dao;

import javax.persistence.*;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/5
 */
@Entity
@Table(name="album_songs")
public class AlbumSongsPO {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer albumsId;

    @Column
    private Integer songsId;

    protected AlbumSongsPO() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public AlbumSongsPO(Integer albumsId, Integer songsId) {
        this.albumsId = albumsId;
        this.songsId = songsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(Integer albumsId) {
        this.albumsId = albumsId;
    }

    public Integer getSongsId() {
        return songsId;
    }

    public void setSongsId(Integer songsId) {
        this.songsId = songsId;
    }
}
