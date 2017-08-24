package com.agivision.alltest.model;

import com.orm.dsl.Ignore;

/**
 * Created by agileo on 2015-09-12.
 *
 */
public abstract class Device extends Entity {
    private String model;
    private String hwaddr;
    private String hashcode;

    private String city;
    private String street;
    private String community;
    private String building;
    private String unit;
    private String door;
    //private String house;
    private String location;
    private String status;
    @Ignore
    private boolean isDisable;


    public Device() {
        super();
        setModel("");
        setHwaddr("");
        setHashcode("");
        setCity("");
        setStreet("");
        setCommunity("");
        setBuilding("");
        setUnit("");
        //setHouse("");
        setDoor("");
        setLocation("");
        setStatus("");
        isDisable = true;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setIsDisable(boolean isDisable) {
        this.isDisable = isDisable;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHwaddr() {
        return hwaddr;
    }

    public void setHwaddr(String hwaddr) {
        this.hwaddr = hwaddr;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /*public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }*/

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
