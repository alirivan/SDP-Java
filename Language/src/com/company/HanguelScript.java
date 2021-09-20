package com.company;

public class HanguelScript extends Language implements WritingBehavior, SentenceStructureBehavior, SpeakingBehavior{

    public HanguelScript() {

    }

    @Override
    public void display() {
        System.out.println("안녕하세요. 저는 한글입니다 ");
    }

    @Override
    public void write() {
        System.out.println("가 나 다 라 마 바");
        System.out.println("아 자 차 하 타 파");
    }

    @Override
    public void sentence_structure() {
        System.out.println("Subject + Object + Verb");
    }

    @Override
    public void speaking() {
        System.out.println("I have 2 - 4 Tones");
    }
}
