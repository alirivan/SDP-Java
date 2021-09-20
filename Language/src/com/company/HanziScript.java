package com.company;

public class HanziScript extends Language implements WritingBehavior, SentenceStructureBehavior, SpeakingBehavior{

    public HanziScript() {

    }

    @Override
    public void display() {
        System.out.println("大家好我是汉子");
    }

    @Override
    public void write() {
        System.out.println("我 想 爱 你");
        System.out.println("但 你 不 爱");
    }

    @Override
    public void sentence_structure() {
        System.out.println("Subject + Object + Verb");
    }

    @Override
    public void speaking() {
        System.out.println("I have 5 - 7 Tones");
    }
}
