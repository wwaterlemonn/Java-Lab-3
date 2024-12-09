package mytype;

import java.util.Random;

public enum Mood {
    HAPPY, CALM, SAD, ANGRY, CONFUSED;

    public static Mood randomMood(){
        return Mood.values()[new Random().nextInt(Mood.values().length)];
    }
}
