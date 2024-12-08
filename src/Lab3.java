import item.Storage;
import item.Trinket;
import mytype.Mood;
import item.SmallStorage;
import creature.Karlson;
import creature.Malish;
import item.Dirt;
import item.Item;

public class Lab3 {
    public static void main(String[] args){
        Storage ground = new Storage("Земля");
        SmallStorage pot = new SmallStorage(8, "Горшочек");
        Karlson karlson = new Karlson();
        Malish malish = new Malish();
        Item bone = new Trinket(1, "Косточка", karlson.hands());
        Item dirt1 = new Dirt(pot);

        karlson.putInto(bone, pot);
        for (int i = 1; i < 4; i++){
            Item dirt = new Dirt(ground);
            karlson.pickUp(dirt, ground);
            karlson.putInto(dirt, pot);
        }
        karlson.pickUp(dirt1, ground); //тест исключения в Storage.add()
        pot.printItems();
        pot.printFill();

        malish.printMood();

        karlson.printMood();
        karlson.setMood(Mood.HAPPY);
        karlson.printMood();
        karlson.makeNoise("кудахтанье");
    }
}
