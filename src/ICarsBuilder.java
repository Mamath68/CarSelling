public interface ICarsBuilder {
    Cars.CarsBuilder addOptions(ECarsOptions option);

    Cars.CarsBuilder estConstruit();

    Cars build();
}
