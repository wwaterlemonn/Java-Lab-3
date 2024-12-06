package item;

public record Item(int volume, String name){
    public Item(int volume, String name, Storage storage){
        this(volume, name);
        storage.add(this);
    }
}