package com.agivision.alltest.model;

import java.util.Date;

/**
 * Created by Administrator on 2016/8/4 0004.
 *
 */
public class ActuatorRawData extends Entity {
    public String hwaddr;
    public String status;
    public Date ts;
    public Double timeOn;
    public Double timeOff;
    public Double switchingValue;
    public Double tempIndoor;
    public Double tempTarget;

    public ActuatorRawData() {
        super();
        setHwaddr("");
        setStatus("");
        setTimeOn(0d);
        setTimeOff(0d);
        setSwitchingValue(0d);
        setTempIndoor(0d);
        setTempTarget(0d);
        setCategory("ACTUATOR_RAWDATA");

    }

    public Double getTempIndoor() {
        return tempIndoor;
    }

    public void setTempIndoor(Double tempIndoor) {
        this.tempIndoor = tempIndoor;
    }

    public Double getTempTarget() {
        return tempTarget;
    }

    public void setTempTarget(Double tempTarget) {
        this.tempTarget = tempTarget;
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

    public Double getTimeOn() {
        return timeOn;
    }

    public void setTimeOn(Double timeOn) {
        this.timeOn = timeOn;
    }

    public Double getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(Double timeOff) {
        this.timeOff = timeOff;
    }

    public Double getSwitchingValue() {
        return switchingValue;
    }

    public void setSwitchingValue(Double switchingValue) {
        this.switchingValue = switchingValue;
    }
}
