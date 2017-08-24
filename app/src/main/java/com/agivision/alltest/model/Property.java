package com.agivision.alltest.model;


import com.orm.dsl.Ignore;

/**
 * Created by Administrator on 2016/4/21 0021.
 *
 */
public abstract class Property extends Entity {
    private Double square;

    private String city;
    private String street;
    private String community;
    private String building;
    private String unit;
    private String door;
    @Ignore
    private boolean isEnable;

    public Property() {
        super();
        setSquare((double) 0);
        setCity("");
        setStreet("");
        setCommunity("");
        setBuilding("");
        setUnit("");
        setDoor("");
        isEnable = true;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setIsEnable(boolean isEnable) {
        this.isEnable = isEnable;
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

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public boolean equals(House it) {
        return door.equals(it.getDoor()) &&
                unit.equals(it.getUnit()) &&
                building.equals(it.getBuilding());
    }
}
