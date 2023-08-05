package org.example.myproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {

    private Music music;
    private Music music2;
    private int volume;
    private String name;

    public MusicPlayer(Music music, Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public MusicPlayer() {
    }

    public String playMusic() {
        return music2.getSong() + " " + music.getSong();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
