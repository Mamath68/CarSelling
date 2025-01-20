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
        private boolean construit = false;

        public CarsBuilder(ECars type) {
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
            if (!construit) {
                throw new Error("La voiture doit être marquée comme construite avant d'être créée.");
            }
            return new Cars(this);
        }
    }
}
