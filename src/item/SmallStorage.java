package item;

public class SmallStorage extends Storage{
    private int capacity;

    public SmallStorage(int capacity, String name){
        super(name);
        this.capacity = capacity;
    }

    public int capacity(){
        return this.capacity;
    }

    @Override
    public void add(Item item){
        if ((this.capacity() - this.fill()) < item.volume()){
            System.out.print(item.name() + " не влез в " + this.name() + ". ");
            return;
        }
        super.add(item);
    }

    @Override
    public void printFill(){
        System.out.print(this.name() + " заполнен на " + this.fill() + " из " + this.capacity() + ". ");
    }
}
