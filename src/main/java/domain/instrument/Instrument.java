package domain.instrument;

public enum Instrument {

    clarinet("clarinet");

    private final String viewName;

    Instrument(final String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }
}
