package com.agivision.alltest.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/1 0001.
 *
 */
public class DeviceAbnormal implements Serializable {
    private String ts;
    private String err;
    private String Hwaddr;
    private String model;
    private String location;

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getHwaddr() {
        return Hwaddr;
    }

    public void setHwaddr(String hwaddr) {
        Hwaddr = hwaddr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
