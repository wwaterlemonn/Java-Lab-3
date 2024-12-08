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

    @Override
    public String toString() {
        return "HealthyPerson [hands: " + hands.toString() + ", name()=" + name() + ", mood()=" + mood() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((hands == null) ? 0 : hands.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        HealthyPerson other = (HealthyPerson) obj;
        if (hands == null) {
            if (other.hands != null)
                return false;
        } else if (!hands.equals(other.hands))
            return false;
        return true;
    }
}
