package com.company;

public abstract class Language {

    SpeakingBehavior speakingBehavior;
    WritingBehavior writingBehavior;
    SentenceStructureBehavior sentenceStructureBehavior;

    public Language() {
    }

    public abstract void display();

    public void performSpeaking() {
        speakingBehavior.speaking();
    }

    public void performWriting() {
        writingBehavior.write();
    }

    public void performSentenceStructure() {
        sentenceStructureBehavior.sentence_structure();
    }

    public void setSpeakingBehavior (SpeakingBehavior spb) {
        speakingBehavior = spb;
    }

    public void setWritingBehavior (WritingBehavior wrb) {
        writingBehavior = wrb;
    }

    public void setSentenceStructureBehavior (SentenceStructureBehavior sntb) {
        sentenceStructureBehavior = sntb;
    }

}
