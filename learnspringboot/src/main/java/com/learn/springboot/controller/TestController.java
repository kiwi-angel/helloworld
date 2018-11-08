package com.learn.springboot.controller;

import com.learn.springboot.dao.AlbumsPO;
import com.learn.springboot.dao.repository.AlbumsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/5
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    AlbumsRepository albumsRepository;

    @GetMapping(value = "/")
    public String testController() {
        return "hello";
    }


    @GetMapping(value = "/${albumsId}")
    public String findOne(@PathVariable("albumsId") Integer albumsId) {
        AlbumsPO albumsPO = albumsRepository.findAlbumsPOById(albumsId);
        logger.info("Album: " + albumsPO.getAlbum());
        logger.info("PublishDate: " + albumsPO.getPublishDate());
        return "success";
    }

}
