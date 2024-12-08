package myexception;

public class SSOverfillException extends Exception{
    public SSOverfillException(){
        super("The total volume of the SmallStorage object's contents has exceeded its capacity");
    }

    public SSOverfillException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }

    @Override
    public String toString(){
        return "SSOverfillException: " + this.getLocalizedMessage();
    }
}
