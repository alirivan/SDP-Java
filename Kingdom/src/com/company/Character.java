package com.company;

public abstract class Character {

    public void fight() {
    }

    public abstract void display();

    WeaponBehavior weaponBehavior;

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }


    public abstract void weaponBehavior();
}
