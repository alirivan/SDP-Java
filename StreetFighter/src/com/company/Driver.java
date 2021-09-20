package com.company;

public class Driver {

    public static void main(String args[]) {
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        Fighter chunLi = new ChunLi(tornadoKick,shortJump);
        chunLi.display();

        chunLi.punch();
        chunLi.kick();
        chunLi.jump();

        chunLi.setJumpBehavior(LongJump);
        chunLi.jump();

        System.out.println("---");

        Fighter asuka = new Asuka(tornadoKick,shortJump);
        asuka.display();

        asuka.punch();
        asuka.kick();
        asuka.jump();

        asuka.setJumpBehavior(LongJump);
        asuka.jump();

        System.out.println("---");

        Fighter ryu = new Ryu(tornadoKick,shortJump);
        ryu.display();

        ryu.punch();
        ryu.kick();
        ryu.jump();

        ryu.setJumpBehavior(LongJump);
        ryu.jump();
    }
}
