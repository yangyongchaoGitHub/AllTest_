package com.agivision.alltest.model;

/**
 * Created by agileo on 2015-09-12.
 *
 */
public class Heatmeter extends Device{
    private Double currentHeat;
    private Double initHeatData, initFlowData;
    private Integer channel;
    private Integer actuatorCount;

    public Heatmeter() {
        super();
        setCurrentHeat(0d);
        setChannel(0);
        setActuatorCount(0);
        setInitFlowData(0d);
        setInitHeatData(0d);
    }

    public Double getCurrentHeat() {
        return currentHeat;
    }

    public void setCurrentHeat(Double currentHeat) {
        this.currentHeat = currentHeat;
    }

    public Double getInitHeatData() {
        return initHeatData;
    }

    public void setInitHeatData(Double initHeatData) {
        this.initHeatData = initHeatData;
    }

    public Double getInitFlowData() {
        return initFlowData;
    }

    public void setInitFlowData(Double initFlowData) {
        this.initFlowData = initFlowData;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getActuatorCount() {
        return actuatorCount;
    }

    public void setActuatorCount(Integer actuatorCount) {
        this.actuatorCount = actuatorCount;
    }
}
