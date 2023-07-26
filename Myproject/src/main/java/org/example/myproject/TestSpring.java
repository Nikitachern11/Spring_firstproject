package org.example.myproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("classicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        musicPlayer2.setVolume(999);
//        System.out.println(musicPlayer.getVolume() + "---" + musicPlayer2.getVolume());
        context.close();
    }
}
