package com.company;

public class Troll extends Character{

    public void fight() {
        System.out.println("Wanna have some some?");
    }

    public Troll () {
        weaponBehavior = new AxeBehavior();
    }

    public void display() {
        System.out.println("I use axe not only to kill but also to fun people :)");
    }

    @Override
    public void weaponBehavior() {

    }
}
