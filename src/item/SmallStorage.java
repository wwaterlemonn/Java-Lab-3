package item;

import myexception.SSOverfillException;

public class SmallStorage extends Storage{
    private int capacity;

    public SmallStorage(int capacity, String name){
        super(name);
        this.capacity = capacity;
    }

    public int capacity(){
        return this.capacity;
    }

    protected void checkEnoughSpace(Item item) throws SSOverfillException{
        if ((this.capacity() - this.fill()) < item.volume()){
            //System.out.print(item.name() + " не влез в " + this.name() + ". ");
            //return;
            throw new SSOverfillException(item.name() + " не влез в " + this.name() + ". ");
        }
    }

    @Override
    protected void add(Item item){
        try{
            //checkEnoughSpace(item);
            if ((this.capacity() - this.fill()) < item.volume()){
                //System.out.print(item.name() + " не влез в " + this.name() + ". ");
                //return;
                throw new SSOverfillException(item.name() + " не влез в " + this.name() + ". ");
            }
            super.add(item);
        }
        catch (SSOverfillException e){
            System.err.print(e.toString());
            return;
        }
    }

    @Override
    public void printFill(){
        System.out.print(this.name() + " заполнен на " + this.fill() + " из " + this.capacity() + ". ");
    }
}
