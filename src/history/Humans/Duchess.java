package history.Humans;

import history.State;
import history.Utensils.Utensils;

public class Duchess extends Human {
    public Duchess(){
        super("Герцогиня");

    }
    @Override
    public String hit(Utensils item){
        setState(State.Ignore);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }
}
