public enum ECarsOptions {
    AIR_CONDITIONNE("Air Conditionné"),
    GPS("GPS intégré"),
    SIEGES_CUIR("Sièges en cuir"),
    TOIT_OUVRANT("Toit ouvrant panoramique"),
    CAMERA_RECUL("Caméra de recul"),
    VITRES_TEINTES("Vitres teintées");

    private final String description;

    ECarsOptions(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
