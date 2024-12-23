import item.Storage;
import item.Trinket;
import mytype.Mood;
import item.SmallStorage;
import creature.Karlson;
import creature.Malish;
import item.Dirt;
import item.Item;
import java.util.Random;

public class Lab3 {
    public static void main(String[] args){
        Random r = new Random();
        Storage ground = new Storage("Земля");
        //SmallStorage pot = new SmallStorage(8, "Горшочек");
        SmallStorage pot = new SmallStorage(r.nextInt(8,18), "Горшочек");
        Karlson karlson = new Karlson();
        Malish malish = new Malish();
        //Item bone = new Trinket(1, "Косточка", karlson.hands());
        Item bone = new Trinket(r.nextInt(1,4), "Косточка", karlson.hands());
        Item dirt1 = new Dirt(pot);

        karlson.putInto(bone, pot);
        for (int i = 1; i < 4; i++){
            Item dirt = new Dirt(ground);
            karlson.pickUp(dirt, ground);
            karlson.putInto(dirt, pot);
        }
        karlson.pickUp(dirt1, ground); //тест исключения в Storage.add()
        System.out.print(pot.itemsToString() + pot.fillToString());

        malish.printMood();

        karlson.printMood();
        karlson.setMood(Mood.HAPPY);
        karlson.printMood();
        karlson.makeNoise("кудахтанье", 36);
    }
}
