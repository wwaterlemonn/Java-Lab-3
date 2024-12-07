package creature;

import item.Item;
import item.SmallStorage;
import item.Storage;
import type.Mood;

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
        storage.remove(item);
        this.hands.add(item);
        System.out.print(this.name() + " подобрал " + item.name() + ". ");
    }

    public void putInto(Item item, Storage storage){
        System.out.print(this.name() + " положил " + item.name() + " в " + storage.name() + ". ");
        this.hands.remove(item);
        storage.add(item);
    }
}
