package creature;

import mytype.Mood;

public class Karlson extends HealthyPerson {
    public Karlson(){
        super("Карлсон", Mood.ANGRY);
    }

    @Override
    public void printMood(){
        switch(this.mood()){
            case SAD:
                System.out.print(this.name() + " нахмурился. ");
                break;
            case CALM:
                System.out.print(this.name() + " спокоен. ");
                break;
            case HAPPY:
                System.out.print(this.name() + " полон энергии. ");
                break;
            case ANGRY:
                System.out.print(this.name() + " в настроении спорить. ");
                break;
            case CONFUSED:
                System.out.print(this.name() + " недоумевает. ");
                break;
        }
    }
}
