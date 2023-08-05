package org.example.myproject;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    public String getSong() {
        return "Wind cries Mary";
    }
}
