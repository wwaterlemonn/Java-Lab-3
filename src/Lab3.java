import item.Storage;
import item.SmallStorage;
import creature.HealthyPerson;
import creature.Person;
import item.Item;
import type.Mood;

public class Lab3 {
    public static void main(String[] args){
        Storage ground = new Storage("Земля");
        SmallStorage pot = new SmallStorage(8, "Горшочек");
        Person karlson = new HealthyPerson("Карлсон", Mood.ANGRY);
        Person malish = new HealthyPerson("Малыш", Mood.CONFUSED);
        Item bone = new Item(1, "Косточка", karlson.hands());
        Item dirt1 = new Item(2, "1-я куча земли", pot);

        karlson.putInto(bone, pot);
        for (int i = 1; i < 4; i++){
            Item dirt = new Item(2, String.valueOf(i+1) + "-я куча земли", ground);
            karlson.pickUp(dirt, ground);
            karlson.putInto(dirt, pot);
        }
        pot.printItems();
        pot.printFill();

        malish.printMood();

        karlson.printMood();
        karlson.setMood(Mood.HAPPY);
        karlson.printMood();
        karlson.makeNoise("кудахтанье");
    }
}
