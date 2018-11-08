package com.learn.springboot.dao.repository;

import com.learn.springboot.dao.AlbumsPO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import javax.persistence.Table;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/5
 */
@Table(name="albums")
@Qualifier("albumsRepository")
public interface AlbumsRepository extends Repository<AlbumsPO, Long> {

    Page<AlbumsPO> findAll(Pageable pageable);

    @Query("select n.id, n.album, n.publish_date, n.date_time from albums n where n.id = id")
    AlbumsPO findAlbumsPOById(@Param("id") Integer id);

}
