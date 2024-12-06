package person;

import item.Item;
import type.Mood;
import item.SmallStorage;
import item.Storage;

public class Person implements Animal{
    private String name;
    private Mood mood = Mood.CALM;
    private SmallStorage hands = new SmallStorage(2, "Руки");

    public Person(String name){
        this.name = name;
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

    public SmallStorage hands(){
        return this.hands;
    }
    
    public void pickUp(Item item, Storage storage){
        storage.remove(item);
        this.hands.add(item);
        System.out.print(this.name + " подобрал " + item.name() + ". ");
    }

    public void putInto(Item item, Storage storage){
        System.out.print(this.name + " положил " + item.name() + " в " + storage.name() + ". ");
        this.hands.remove(item);
        storage.add(item);
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((mood == null) ? 0 : mood.hashCode());
        result = prime * result + ((hands == null) ? 0 : hands.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (mood != other.mood)
            return false;
        if (hands == null) {
            if (other.hands != null)
                return false;
        } else if (!hands.equals(other.hands))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", mood=" + mood + ", hands=" + hands + "]";
    }

}
