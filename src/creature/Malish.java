package creature;

import mytype.Mood;

public class Malish extends HealthyPerson {
    public Malish(){
        super("Малыш", Mood.CONFUSED);
    }

    @Override
    public void printMood(){
        switch(this.mood()){
            case SAD:
                System.out.print(this.name() + " загрустил. ");
                break;
            case CALM:
                System.out.print(this.name() + " спокоен. ");
                break;
            case HAPPY:
                System.out.print(this.name() + " полон радости. ");
                break;
            case ANGRY:
                System.out.print(this.name() + " дуется. ");
                break;
            case CONFUSED:
                System.out.print(this.name() + " не знает, что сказать. ");
                break;
        }
    }

    @Override
    public String toString() {
        return "Malish [hands: " + hands().toString() + ", name()=" + name() + ", mood()=" + mood() + "]";
    }

    //hashCode и equals нет смысла переопределять, класс только устанавливает конкретные значения полей и не добавляет нового
}
