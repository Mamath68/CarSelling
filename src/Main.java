/*
 * Votre tâche est de créer un système de commande de voiture.
 * Un client doit pouvoir choisir différentes options pour sa voiture.
 * Les options sont en Enum et non en String.
 * Créer au moins DEUX exemples de voiture avec le Director, et un exemple libre.
 * Afficher le contenu via un toString.
 */

public class Main {
    public static void main(String[] args) {
        Cars electricCar = CarsDirector.makeElectricCar();
        Cars hybridCar = CarsDirector.makeHybridCar();

        Cars customCar = new Cars.CarsBuilder(ECars.DIESEL)
                .addOptions(ECarsOptions.GPS)
                .addOptions(ECarsOptions.AIR_CONDITIONNE)
                .addOptions(ECarsOptions.SIEGES_CUIR)
                .estConstruit()
                .build();

        System.out.println("Voiture électrique : " + electricCar);
        System.out.println("Voiture hybride : " + hybridCar);
        System.out.println("Voiture personnalisée : " + customCar);
    }
}
