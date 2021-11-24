package history.Humans;

import history.State;
import history.Utensils.Utensils;

public class Alice extends Human {
    public Alice(){
        super("Алиса");

    }
    @Override
    public String hit(Utensils item){
        setState(State.Fear);
        return "В " + this.getName() + " прилетело " + item.getName() + ". ";
    }
}
