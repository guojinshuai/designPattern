package com.gjs.design.factorymethod.leifeng;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng createFactory() {
        return new Volunteer();
    }
}
