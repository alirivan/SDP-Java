package com.company;

public class Grammar extends Language implements SentenceStructureBehavior{

    public Grammar() {
        System.out.println("I am your Nightmare");
    }

    @Override
    public void display() {

    }

    @Override
    public void sentence_structure() {
        System.out.println("Subject + Object + Verb");
        System.out.println("Subject + Verb + Object");
    }
}
