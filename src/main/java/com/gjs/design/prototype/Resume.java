package com.gjs.design.prototype;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    @Override
    public Resume clone() {
        Resume resume = new Resume(name);
        resume.sex = this.sex;
        resume.age = this.age;
        resume.workExperience = resume.workExperience.clone();
        return resume;
    }
}
