package item;

public record Trinket(int volume, String name) implements Item{
    public Trinket(int volume, String name, Storage storage){
        this(volume, name);
        storage.add(this);
    }

    //record сам переопределяет hashCode, equals, toString
}