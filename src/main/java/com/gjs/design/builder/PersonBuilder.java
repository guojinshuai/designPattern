package com.gjs.design.builder;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class PersonBuilder extends Builder {

    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    @Override
    public Builder name(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public Builder sex(String sex) {
        person.setSex(sex);
        return this;
    }

    @Override
    public Builder age(int age) {
        person.setAge(age);
        return this;
    }

    public Person build() {
        return person;
    }
}
