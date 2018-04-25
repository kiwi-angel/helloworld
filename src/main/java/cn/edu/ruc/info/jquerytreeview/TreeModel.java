package com.company.jquerytreeview;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/3/20
 */
//模拟数据库中存储的对象数据
public class TreeModel {
    private int id;
    private String text;
    private int parentId;

    public TreeModel(int id, String text, int parentId) {
        this.id = id;
        this.text = text;
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
