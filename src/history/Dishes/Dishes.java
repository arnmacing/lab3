package history.Dishes;

public interface Dishes {
    default String getAction() {
        return getName() + " посыпались градом.";
    };
    String getName();
}
