package com.agivision.alltest.model;

import android.util.Log;

import java.util.Date;

/**
 * Created by agileo on 2015-09-18.
 *
 */
public class AllocatedHeatData extends Entity {
    public String hashcode;    //分摊号码（抄表号）
    public Date ts;            //分摊时间

    public Double heating;     //户单次分摊热量
    public Double heatAmount;  //户总热用量
    public Double flowAmount;  //户总流量
    public Double openTime;    //阀门总开时间


    public AllocatedHeatData() {
        super();
        this.setHashcode("");
        this.setTs(new Date(System.currentTimeMillis()));
        this.setHeatAmount(0d);
        this.setFlowAmount(0d);
        this.setOpenTime(0d);
    }

    public void toLog() {
        Log.i("AllocatedHeatData", " hashcode = " + hashcode +
                " heating" + heating +
                " heatAmount" + heatAmount +
                " flowAmount" + flowAmount +
                " openTime" + openTime);
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Double getHeatAmount() {
        return heatAmount;
    }

    public void setHeatAmount(Double heatAmount) {
        this.heatAmount = heatAmount;
    }

    public Double getHeating() {
        return heating;
    }

    public void setHeating(Double heating) {
        this.heating = heating;
    }

    public Double getFlowAmount() {
        return flowAmount;
    }

    public void setFlowAmount(Double flowAmount) {
        this.flowAmount = flowAmount;
    }

    public Double getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Double openTime) {
        this.openTime = openTime;
    }
}
