package com.agivision.alltest.model;

import com.orm.dsl.Ignore;

/**
 * Created by agileo on 2015-09-12.
 *
 */
public class House extends Property {
    private String owner;
    private String heatmeter;
    private String actuator;
    private String hashcode;

    @Ignore
    public AllocatedHeatData allocated;

    public House() {
        super();
        setOwner("");
        setHeatmeter("");
        setActuator("");
        setHashcode("");
        setCategory("HOUSE");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHeatmeter() {
        return heatmeter;
    }

    public void setHeatmeter(String heatmeter) {
        this.heatmeter = heatmeter;
    }

    public String getActuator() {
        return actuator;
    }

    public void setActuator(String actuator) {
        this.actuator = actuator;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    /*@Override
    public long save() {
        owner.save();
        heatmeter.save();
        actuator.save();

        return super.save();
    }*/

    @Override
    public boolean equals(House it) {
        return getDoor().equals(it.getDoor()) &&
                getUnit().equals(it.getUnit()) &&
                getBuilding().equals(it.getBuilding());
    }
}
