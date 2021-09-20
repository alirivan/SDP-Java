package com.company;

public class LatinScript extends Language implements WritingBehavior, SentenceStructureBehavior, SpeakingBehavior{

    public LatinScript() {
        sentenceStructureBehavior = new SentenceStructureBehavior() {
            @Override
            public void sentence_structure() {
                System.out.println("Subject + Object + Verb");
                System.out.println("Subject + Verb + Object");
            }
        };

        speakingBehavior = new SpeakingBehavior() {
            @Override
            public void speaking() {
                System.out.println("I have no Tones");
            }
        };

        writingBehavior = new WritingBehavior() {
            @Override
            public void write() {
                System.out.println("A À Á Â Ä Æ Ã Å Ā");
                System.out.println("B");
                System.out.println("C Ç Ć Č");
                System.out.println("D Ď");
            }
        };
    }

    public void display() {
        System.out.println("Hello, I am Latin Script");
    }


    @Override
    public void write() {

    }

    @Override
    public void speaking() {

    }

    @Override
    public void sentence_structure() {

    }
}
