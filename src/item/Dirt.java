package item;

public class Dirt extends Powder{
    private static int id = 1;

    public Dirt(){
        super(String.valueOf(id) + "-я куча земли", 2, 0.1);
        id ++;
    }
    public Dirt(Storage storage){
        super(String.valueOf(id) + "-я куча земли", 2, 0.1, storage);
        id ++;
    }
    public Dirt(String name){
        super(name, 2, 0.1);
        id ++;
    }
    public Dirt(int volume){
        super(String.valueOf(id) + "-я куча земли", volume, 0.1);
        id ++;
    }
    public Dirt(String name, int volume){
        super(name, volume, 0.1);
        id ++;
    }
    public Dirt(String name, int volume, Storage storage){
        super(name, volume, 0.1, storage);
        id ++;
    }

    @Override
    public String toString() {
        return "Dirt [volume=" + volume() + ", name=" + name() + ", lossCof=" + lossCof() + "]";
    }

    //hashCode и equals нет смысла переопределять, класс только устанавливает конкретные значения полей и не добавляет нового
}
