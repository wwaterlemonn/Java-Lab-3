package item;

public interface Item {
    String name();
    int volume();
    default void move(Storage oldStorage, Storage newStorage){
        oldStorage.remove(this);
        newStorage.add(this);
    }
}
