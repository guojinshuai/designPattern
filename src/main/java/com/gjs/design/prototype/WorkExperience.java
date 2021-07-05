package com.gjs.design.prototype;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class WorkExperience implements Cloneable {

    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public WorkExperience clone() {
        Object obj;
        try {
            obj = super.clone();
            return (WorkExperience) obj;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
