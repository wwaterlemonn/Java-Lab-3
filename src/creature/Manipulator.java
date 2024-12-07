package creature;

import item.Item;
import item.Storage;

public interface Manipulator {
    void pickUp(Item item, Storage storage);
    void putInto(Item item, Storage storage);
}
