package com.agivision.alltest.model;

/**
 * Created by Administrator on 2015/11/17 0017.
 */
public class Info extends Entity{
    private Long num;
    private String hardwareAddr;

    public Info() {
        super();
        setNum((long)0);
        setHardwareAddr("");
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getHardwareAddr() {
        return hardwareAddr;
    }

    public void setHardwareAddr(String hardwareAddr) {
        this.hardwareAddr = hardwareAddr;
    }

}
