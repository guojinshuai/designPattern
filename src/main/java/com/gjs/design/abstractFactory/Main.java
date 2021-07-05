package com.gjs.design.abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory modernFactory = new MagicFactory();
        Food food = modernFactory.createFood();
        Vehicle vehicle = modernFactory.createVehicle();
        Weapon weapon = modernFactory.createWeapon();

        food.printName();
        vehicle.go();
        weapon.shoot();
    }
}
