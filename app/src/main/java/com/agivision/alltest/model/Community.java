package com.agivision.alltest.model;

/**
 * Created by Administrator on 2015/11/16 0016.
 *
 */
public class Community extends Property{

    private Integer houseCount;
    private Integer concentratorCount;
    private String beginDate;
    private String endDate;
    private Integer heatCycle;
    private Double heatUnitPrice;
    private Double areaUnitPrice;
    private Double meterageRatio;//计量系数

    public Community() {
        super();
        setHouseCount(0);
        setConcentratorCount(0);
        setBeginDate("");
        setEndDate("");
        setHeatCycle(0);
        setHeatUnitPrice(0d);
        setAreaUnitPrice(0d);
        setMeterageRatio(0d);
        setCategory("COMMUNITY");
    }

    public Integer getHeatCycle() {
        return heatCycle;
    }

    public void setHeatCycle(Integer heatCycle) {
        this.heatCycle = heatCycle;
    }

    public Double getHeatUnitPrice() {
        return heatUnitPrice;
    }

    public void setHeatUnitPrice(Double heatUnitPrice) {
        this.heatUnitPrice = heatUnitPrice;
    }

    public Double getAreaUnitPrice() {
        return areaUnitPrice;
    }

    public void setAreaUnitPrice(Double areaUnitPrice) {
        this.areaUnitPrice = areaUnitPrice;
    }

    public Double getMeterageRatio() {
        return meterageRatio;
    }

    public void setMeterageRatio(Double meterageRatio) {
        this.meterageRatio = meterageRatio;
    }

    public Integer getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Integer houseCount) {
        this.houseCount = houseCount;
    }

    public Integer getConcentratorCount() {
        return concentratorCount;
    }

    public void setConcentratorCount(Integer concentratorCount) {
        this.concentratorCount = concentratorCount;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
