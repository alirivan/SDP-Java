package com.company;

public class Knight extends Character{

    public void fight() {
        System.out.println("Na obardazh");
    }

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    public void display() {
        System.out.println("I use sword to destroy you, my Grace!");
    }

    @Override
    public void weaponBehavior() {
        System.out.println("I use sword to destroy you, my Grace!");
    }
}
