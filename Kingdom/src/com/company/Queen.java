package com.company;

public class Queen extends Character{

    public void fight() {
        System.out.println("I am your Grace");
    }

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    public void display() {
        System.out.println("Bows and Arrows are settled");
    }

    @Override
    public void weaponBehavior() {

    }
}
