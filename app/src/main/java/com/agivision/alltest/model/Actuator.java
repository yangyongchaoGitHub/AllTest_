package com.agivision.alltest.model;

import com.orm.dsl.Ignore;

import java.io.Serializable;

/**
 * Created by agileo on 2015-09-12.
 *
 */
public  class Actuator extends Device {

    public class Setting implements Serializable {
        public Integer begin;
        public Integer end;
        public Float temperature;

        public void fromString(String string) {
            String[] values = string.split(",");
            begin = Integer.parseInt(values[0]);
            end = Integer.parseInt(values[1]);
            temperature = Float.parseFloat(values[2]);
        }
        @Override
        public String toString() {
            return "" + begin + "," + end + "," + temperature;
        }
    }

    @Ignore
    private Setting[] settings = new Setting[4];

    private String charging;
    private Integer targetTEMP;

    //private Heatmeter heatmeter;
    private Integer thermostatCount;
    private Integer channel;
    private Double initOpenTime, initCloseTime;

    public Actuator() {
        super();
        setSettings(new Setting[]{});
        setTargetTEMP(0);

        //setHeatmeter(new Heatmeter());
        setThermostatCount(0);
        setChannel(0);
        setCategory("ACTUATOR");
        setInitCloseTime(0d);
        setInitOpenTime(0d);
    }

    public Setting[] getSettings() {
        return settings;
    }

    public void setSettings(Setting[] settings) {
        this.settings = settings;
    }

    public String getCharging() {
        return charging;
    }

    public void setCharging(String charging) {
        this.charging = charging;
    }

    public Integer getTargetTEMP() {
        return targetTEMP;
    }

    public void setTargetTEMP(Integer targetTEMP) {
        this.targetTEMP = targetTEMP;
    }

    public Integer getThermostatCount() {
        return thermostatCount;
    }

    public void setThermostatCount(Integer thermostatCount) {
        this.thermostatCount = thermostatCount;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Double getInitOpenTime() {
        return initOpenTime;
    }

    public void setInitOpenTime(Double initOpenTime) {
        this.initOpenTime = initOpenTime;
    }

    public Double getInitCloseTime() {
        return initCloseTime;
    }

    public void setInitCloseTime(Double initCloseTime) {
        this.initCloseTime = initCloseTime;
    }
}
