import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final ECars type;
    private final List<ECarsOptions> options;

    private Cars(CarsBuilder builder) {
        this.type = builder.type;
        this.options = builder.options;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "type=" + type +
                ", options=" + options +
                '}';
    }

    public static class CarsBuilder implements ICarsBuilder {
        private final ECars type;
        private final List<ECarsOptions> options = new ArrayList<>();
        private boolean construit;

        public CarsBuilder(ECars type) {
            this.construit = false;
            this.type = type;
        }

        @Override
        public CarsBuilder addOptions(ECarsOptions option) {
            options.add(option);
            return this;
        }

        @Override
        public CarsBuilder estConstruit() {
            construit = true;
            return this;
        }

        @Override
        public Cars build() {
            return new Cars(this);
        }

    }
}
