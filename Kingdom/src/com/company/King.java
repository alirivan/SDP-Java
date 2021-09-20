package com.company;

public class King extends Character{

    public void fight() {
        System.out.println("King's Power");
    }

    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    public void display() {
        System.out.println("I have only knife");
    }

    @Override
    public void weaponBehavior() {

    }
}
