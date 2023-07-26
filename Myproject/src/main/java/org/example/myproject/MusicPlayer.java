package org.example.myproject;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private int volume;
    private String name;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
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
