package history.Humans;

import history.State;
import history.Utensils.Utensils;

public class Baby extends Human {
    public Baby(){
        super("Ребёночек");

    }
    @Override
    public String hit(Utensils item){
        setState(State.Scream);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }
}