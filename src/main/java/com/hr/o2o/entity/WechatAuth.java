package com.hr.o2o.entity;

import java.util.Date;

public class WechatAuth {
    private Long wechatAuthID;
    private String openID;
    private Date createTime;
    private PersonInfo personInfo;

    public Long getWechatAuthID() {
        return wechatAuthID;
    }

    public void setWechatAuthID(Long wechatAuthID) {
        this.wechatAuthID = wechatAuthID;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
