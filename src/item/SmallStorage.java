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

    @Override
    protected void add(Item item){
        try{
            if ((this.capacity() - this.fill()) < item.volume()){
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
    public String fillToString(){
        return (this.name() + " заполнен на " + this.fill() + " из " + this.capacity() + ". ");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + capacity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        SmallStorage other = (SmallStorage) obj;
        if (capacity != other.capacity)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SmallStorage [name=" + name() + "; " + this.itemsToString() +"; " + this.fillToString() +"]";
    }
}
