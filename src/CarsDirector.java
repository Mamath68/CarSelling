public class CarsDirector {

    public static Cars makeElectricCar() {
        return new Cars.CarsBuilder(ECars.ELECTRIQUE)
                .addOptions(ECarsOptions.AIR_CONDITIONNE)
                .addOptions(ECarsOptions.GPS)
                .addOptions(ECarsOptions.CAMERA_RECUL)
                .estConstruit()
                .build();
    }

    public static Cars makeHybridCar() {
        return new Cars.CarsBuilder(ECars.HYBRIDE)
                .addOptions(ECarsOptions.SIEGES_CUIR)
                .addOptions(ECarsOptions.TOIT_OUVRANT)
                .addOptions(ECarsOptions.VITRES_TEINTES)
                .estConstruit()
                .build();
    }
}
