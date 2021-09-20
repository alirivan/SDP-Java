package com.company;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Latin Script");
        System.out.println("---");
        Language latinScript = new LatinScript();
        latinScript.performSpeaking();
        System.out.println("---");
        latinScript.performSentenceStructure();
        System.out.println("---");
        latinScript.performWriting();
        System.out.println("");
    }
}
