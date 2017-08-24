package com.agivision.alltest.model;

/**
 * Created by agileo on 2015-09-18.
 *
 */
public class Event extends Entity {
    private Long ts;
    private String family;
    private String details;

    public Event() {
        super();
        setTs((long)0);
        setFamily("");
        setDetails("");
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
