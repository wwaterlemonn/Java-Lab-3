package item;

public abstract class Powder implements Item{
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
        this.volume = volume;
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + volume;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(lossCof);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Powder other = (Powder) obj;
        if (volume != other.volume)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(lossCof) != Double.doubleToLongBits(other.lossCof))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Powder [volume=" + volume + ", name=" + name + ", lossCof=" + lossCof + "]";
    }
}
