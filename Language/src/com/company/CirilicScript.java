package com.company;

public class CirilicScript extends Language implements WritingBehavior, SentenceStructureBehavior, SpeakingBehavior{

    public CirilicScript() {

    }

    @Override
    public void display() {
        System.out.println("Привет, я Кирилица");
    }

    @Override
    public void write() {
        System.out.println("А Б В Г Д Е Ё");
    }

    @Override
    public void sentence_structure() {
        System.out.println("Subject + Object + Verb");
        System.out.println("Subject + Verb + Object");
    }

    @Override
    public void speaking() {
        System.out.println("I have no Tones");
    }
}
