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

    public abstract void makeNoise(String msg, int volume);

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

    @Override
    public String toString() {
        return "Person [name=" + name + ", mood=" + mood + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((mood == null) ? 0 : mood.hashCode());
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
        return true;
    }

    
}
