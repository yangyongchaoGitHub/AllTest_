package com.agivision.alltest.model;

/**
 * Created by agileo on 2015-09-16.
 *
 */
public class Owner extends Entity{
    private String phone;
    private String email;
    private String account;
    private String citizenIdNumber;

    private String emergencyPhone;
    private Integer houseCount;
    private String level;
    private String type;

    public Owner() {
        super();
        setPhone("");
        setEmail("");
        setAccount("");
        setEmergencyPhone("");
        setHouseCount(0);
        setLevel("");
        setType("");
        setCitizenIdNumber("");
        setCategory("OWNER");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public Integer getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Integer houseCount) {
        this.houseCount = houseCount;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCitizenIdNumber() {
        return citizenIdNumber;
    }

    public void setCitizenIdNumber(String citizenIdNumber) {
        this.citizenIdNumber = citizenIdNumber;
    }
}
