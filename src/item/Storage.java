package item;

import java.util.ArrayList;

public class Storage{
    private int fill = 0;
    private String name;
    private ArrayList<Item> contents = new ArrayList<Item>();

    public Storage(String name){
        this.name = name;
    }

    public int fill(){
        return this.fill;
    }

    public String name(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Item> contents(){
        return contents;
    }

    public String itemsToString(){
        if (contents.size()==0){
            return this.name() + " пуст.";
        }
        String s = "";
        s += (this.name + " содержит " + contents.get(0).name());
        for (Item item: contents.subList(1, contents.size())){
            s += (", " + item.name());
        }
        s += (". ");
        return s;
    }

    public String fillToString(){
        return (this.name() + " заполнен на " + this.fill() + ". ");
    }

    public class NoSuchItemException extends IllegalArgumentException{
        public NoSuchItemException(){
            super("No such item found in the Storage object");
        }
    
        public NoSuchItemException(String message){
            super(message);
        }
    
        @Override
        public String getMessage(){
            return super.getMessage();
        }
    
        @Override
        public String toString(){
            return "NoSuchItemException: " + this.getLocalizedMessage();
        }
    }

    protected void remove(Item item){
        try{
            if (!this.contents.remove(item)){
                throw new NoSuchItemException(item.name() + " не было в " + this.name() + ". ");
            }
            this.fill -= item.volume();
        }
        catch(NoSuchItemException e){
            System.out.print(e.toString());
            return;
        }
    }

    protected void add(Item item){
        this.contents.add(item);
        this.fill += item.volume();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + fill;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Storage other = (Storage) obj;
        if (fill != other.fill)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (contents == null) {
            if (other.contents != null)
                return false;
        } else if (!contents.equals(other.contents))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Storage [name=" + name + "; " + this.itemsToString() +"; " + this.fillToString() +"]";
    }
}
