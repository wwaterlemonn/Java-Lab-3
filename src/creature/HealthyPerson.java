package creature;

import item.Item;
import item.SmallStorage;
import item.Storage;
import mytype.Mood;

public class HealthyPerson extends Person implements Manipulator{
    private SmallStorage hands = new SmallStorage(2, "Руки");
    
    public HealthyPerson(){
        super();
    }

    public HealthyPerson(String name){
        super(name);
    }

    public HealthyPerson(String name, Mood mood){
        super(name, mood);
    }

    public SmallStorage hands(){
        return this.hands;
    }

    public void pickUp(Item item, Storage storage){
        System.out.print(this.name() + " подобрал " + item.name() + " из " + storage.name() + ". ");
        item.move(storage, this.hands);
    }

    public void putInto(Item item, Storage storage){
        System.out.print(this.name() + " положил " + item.name() + " в " + storage.name() + ". ");
        item.move(this.hands(), storage);
    }

    public void printMood(){
        switch(this.mood()){
            case SAD:
                System.out.print(this.name() + " опечален. ");
                break;
            case CALM:
                System.out.print(this.name() + " спокоен. ");
                break;
            case HAPPY:
                System.out.print(this.name() + " счастлив. ");
                break;
            case ANGRY:
                System.out.print(this.name() + " злится. ");
                break;
            case CONFUSED:
                System.out.print(this.name() + " в замешательстве. ");
                break;
        }
    }
}
