package org.example.myproject;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my initialization.");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction.");
    }

    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();

    }
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
