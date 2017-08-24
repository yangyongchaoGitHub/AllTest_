package com.agivision.alltest.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/4 0004.
 *
 */
public class HeatmeterRawData extends Entity {
    public String hwaddr;
    public String status;
    public Date ts;
    public Double flowRate;
    public Double flowAmount;
    public Double TempWaterSupply;
    public Double TempWaterReturn;
    public Double heatAmount;
    public Double coldAmount;
    public Double uptime;
    public Double power;

    public HeatmeterRawData() {
        this.setHwaddr("");
        this.setTs(new Date(System.currentTimeMillis()));
        this.setFlowRate(0d);
        this.setFlowAmount(0d);
        this.setTempWaterSupply(0d);
        this.setTempWaterReturn(0d);
        this.setHeatAmount(0d);
        this.setColdAmount(0d);
        this.setUptime(0d);
        this.setPower(0d);
        this.setStatus("");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHwaddr() {
        return hwaddr;
    }

    public void setHwaddr(String hwaddr) {
        this.hwaddr = hwaddr;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Double getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(Double flowRate) {
        this.flowRate = flowRate;
    }

    public Double getFlowAmount() {
        return flowAmount;
    }

    public void setFlowAmount(Double flowAmount) {
        this.flowAmount = flowAmount;
    }

    public Double getTempWaterSupply() {
        return TempWaterSupply;
    }

    public void setTempWaterSupply(Double tempWaterSupply) {
        TempWaterSupply = tempWaterSupply;
    }

    public Double getTempWaterReturn() {
        return TempWaterReturn;
    }

    public void setTempWaterReturn(Double tempWaterReturn) {
        TempWaterReturn = tempWaterReturn;
    }

    public Double getHeatAmount() {
        return heatAmount;
    }

    public void setHeatAmount(Double heatAmount) {
        this.heatAmount = heatAmount;
    }

    public Double getColdAmount() {
        return coldAmount;
    }

    public void setColdAmount(Double coldAmount) {
        this.coldAmount = coldAmount;
    }

    public Double getUptime() {
        return uptime;
    }

    public void setUptime(Double uptime) {
        this.uptime = uptime;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }
}
