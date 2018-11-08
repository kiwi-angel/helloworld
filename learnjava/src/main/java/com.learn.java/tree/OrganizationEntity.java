package com.learn.java.tree;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/3/21
 */
public class OrganizationEntity {

    public int parentId;
    public int orgId;
    public String orgName;

    public int getParentId() {
        return parentId;
    }
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
    public int getOrgId() {
        return orgId;
    }
    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }
    public String getOrgName() {
        return orgName;
    }
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}