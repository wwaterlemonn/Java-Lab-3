package item;

public class Powder implements Item{
    private int volume;
    private final String name;
    private final double lossCof;

    public Powder(){
        this.name = "Порошок";
        this.volume = 1;
        this.lossCof = 0.1;
    }
    public Powder(String name){
        this.name = name;
        this.volume = 1;
        this.lossCof = 0.1;
    }
    public Powder(String name, int volume){
        this.name = name;
        this.volume = 1;
        this.lossCof = 0.1;
    }
    public Powder(String name, int volume, double lossCof){
        this.name = name;
        this.volume = 1;
        this.lossCof = lossCof;
    }
    public Powder(String name, int volume, double lossCof, Storage storage){
        this.name = name;
        this.volume = 1;
        this.lossCof = lossCof;
        storage.add(this);
    }

    public String name(){
        return this.name;
    }

    public int volume(){
        return this.volume;
    }

    public double lossCof(){
        return this.lossCof;
    }

    public void move(Storage oldStorage, Storage newStorage){
        oldStorage.remove(this);
        this.volume -= Math.floor(lossCof*this.volume);
        newStorage.add(this);
    }
}
