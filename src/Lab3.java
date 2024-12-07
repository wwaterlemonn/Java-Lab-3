import item.Storage;
import item.Trinket;
import item.SmallStorage;
import creature.HealthyPerson;
import item.Dirt;
import item.Item;
import type.Mood;

public class Lab3 {
    public static void main(String[] args){
        Storage ground = new Storage("Земля");
        SmallStorage pot = new SmallStorage(8, "Горшочек");
        HealthyPerson karlson = new HealthyPerson("Карлсон", Mood.ANGRY);
        HealthyPerson malish = new HealthyPerson("Малыш", Mood.CONFUSED);
        Item bone = new Trinket(1, "Косточка", karlson.hands());
        Item dirt1 = new Dirt(pot);

        karlson.putInto(bone, pot);
        for (int i = 1; i < 4; i++){
            Item dirt = new Dirt(ground);
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
