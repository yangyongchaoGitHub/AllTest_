package com.agivision.alltest.model;

/**
 * Created by Administrator on 2017/2/6 0006.
 *
 */
public class AlarmStatus extends Entity {
    private String actuator;
    private String time;
    private String hashcode;
    private String status;

    public AlarmStatus() {
        setActuator("");
        setTime("");
        setHashcode("");
        setStatus("");
        setCategory("ALARM_STATUS");
    }

    public String getActuator() {
        return actuator;
    }

    public void setActuator(String actuator) {
        this.actuator = actuator;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
