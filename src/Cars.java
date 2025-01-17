public class Cars {

    private ECars type;

    private Cars(CarsBuilder builder) {
        this.type = builder.type;
    }

    public ECars getType() {
        return type;
    }

    public void setType(ECars type) {
        this.type = type;
    }

    public static class CarsBuilder implements ICarsBuilder {
        private final ECars type = null;

    }

}
