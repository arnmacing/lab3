package history;

public enum State {
    Scream,
    Fear,
    Ignore;

    public static String locale(State state) {
        switch (state) {
            case Fear: {
                return " вне себя от ужаса.";
            }
            case Ignore: return " ничего не замечает.";
            case Scream: return " кричит.";
        }
        return "";
    }
}
