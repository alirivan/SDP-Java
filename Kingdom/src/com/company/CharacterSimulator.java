package com.company;

public class CharacterSimulator {
    public static void main(String[] args) {

        Character Knight = new Knight();
        Knight.fight();
        Knight.performWeapon();

        System.out.println("");

        Character Queen = new Queen();
        Queen.fight();
        Queen.performWeapon();

        System.out.println("");

        Character King = new King();
        King.fight();
        King.performWeapon();

        System.out.println("");

        Character Troll = new Troll();
        Troll.fight();
        Troll.performWeapon();
    }
}
