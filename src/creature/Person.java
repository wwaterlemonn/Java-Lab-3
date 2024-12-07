package creature;

import type.Mood;

public class Person implements Animal, Emotional{
    private String name;
    private Mood mood;

    public Person(){
        this.name = "Без имени";
        this.mood = Mood.CALM;
    }

    public Person(String name){
        this.name = name;
        this.mood = Mood.CALM;
    }

    public Person(String name, Mood mood){
        this.name = name;
        this.mood = mood;
    }

    public void makeNoise(String noise){
        System.out.print(this.name + " издал звук: " + noise + ". ");
    }

    public String name(){
        return this.name;
    }

    public Mood mood(){
        return this.mood;
    }

    public void setMood(Mood mood){
        this.mood = mood;
        System.out.print("Настроение у " + this.name + " поменялось. ");
    }



    public void printMood(){
        switch(this.mood){
            case SAD:
                System.out.print(this.name + " опечален. ");
                break;
            case CALM:
                System.out.print(this.name + " спокоен. ");
                break;
            case HAPPY:
                System.out.print(this.name + " полон радости. ");
                break;
            case ANGRY:
                System.out.print(this.name + " в настроении спорить. ");
                break;
            case CONFUSED:
                System.out.print(this.name + " не знает, что ответить. ");
                break;
        }
    }    
}