package history.Humans;

import history.State;
import history.Utensils.Utensils;

public abstract class Human {
    private String name;
    private State state;

    public Human(String name){
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }
    public String getState() {
        return this.getName() + State.locale(this.state);
    }
    protected void setState(State state) {
        this.state = state;
    }
    abstract public String hit(Utensils item);
    //
    // that's couple of ABSOLUTELY useless methods
    //
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    // I LITERALLY HAve NO IDEA WHY THIS EVEN EXISTS

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Human) {
            return name.equals(((Human) obj).getName());
        }
        return false;
    }

    // XDDDDDD (kill me someone)

}
