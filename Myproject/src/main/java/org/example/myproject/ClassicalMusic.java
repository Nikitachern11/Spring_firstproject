package org.example.myproject;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization.");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction.");
    }

    public ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();

    }
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
