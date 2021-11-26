package history.Dishes;

public class Plate implements Dishes {
    @Override
    public String getName() { return "Тарелки"; };

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return !(obj == null || getClass() != obj.getClass());
    }

    @Override
    public String toString() {
        return "Действие посыпались";
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * 127;
    }
}

