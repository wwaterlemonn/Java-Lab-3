package creature;

import mytype.Mood;

public abstract class Person implements Animal, Emotional{
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

    public abstract void printMood(); 
}
