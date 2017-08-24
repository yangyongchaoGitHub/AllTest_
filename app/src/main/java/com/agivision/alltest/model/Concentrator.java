package com.agivision.alltest.model;

/**
 * Created by agileo on 2015-09-12.
 *
 */
public class Concentrator extends Device{
    private String serverIp;
    private Integer port;
    private Integer DACycle;
    private String strategy;
    private String heartbeatIp;
    private Integer channelNum;
    private String phoneNum;
    private Integer heatmeterCount;
    private Integer actuatorCount;

    public Concentrator() {
        super();
        setDACycle(0);
        setPort(0);
        setStrategy("");
        setServerIp("");
        setHeartbeatIp("");
        setChannelNum(0);
        setPhoneNum("");
        setHeatmeterCount(0);
        setActuatorCount(0);
        setCategory("CONCENTRATOR");
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String server) {
        this.serverIp = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getDACycle() {
        return DACycle;
    }

    public void setDACycle(Integer DACycle) {
        this.DACycle = DACycle;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getHeartbeatIp() {
        return heartbeatIp;
    }

    public void setHeartbeatIp(String heartbeatIp) {
        this.heartbeatIp = heartbeatIp;
    }

    public Integer getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(Integer channelNum) {
        this.channelNum = channelNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getHeatmeterCount() {
        return heatmeterCount;
    }

    public void setHeatmeterCount(Integer heatmeterCount) {
        this.heatmeterCount = heatmeterCount;
    }

    public Integer getActuatorCount() {
        return actuatorCount;
    }

    public void setActuatorCount(Integer actuatorCount) {
        this.actuatorCount = actuatorCount;
    }
}
