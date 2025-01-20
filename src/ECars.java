public enum ECars {
    ELECTRIQUE("électrique"),
    HYBRIDE("hybride"),
    DIESEL("diesel"),
    ESSENCE("essence"),
    BIOETHANOL("bioéthanol");

    private final String description;

    ECars(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
