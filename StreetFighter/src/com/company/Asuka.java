package com.company;

class Asuka extends Fighter {
    public Asuka(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior,jumpBehavior);
    }
    public void display() {
        System.out.println("Asuka");
    }
}
