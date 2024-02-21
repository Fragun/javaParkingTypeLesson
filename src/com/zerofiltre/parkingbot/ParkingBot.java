package com.zerofiltre.parkingbot;

public class ParkingBot {

    /**
     * fonction principale d'un programme' Java
      * @param args Représente les données passées en paramètre lors du lancement du programme
     */
    public static void main(String[] args) {
        sayHello(args[0]);
    }

    /**
     * Permet d'accueillir et de présenter les services à l'utilisateur protentiel du parking
     * @param arg Représente le nom de l'utilisateur potentiel
     */
    private static void sayHello(String arg) {
        String welcomeMessage = "Hello " + arg + ", bienvenue au Parking Zerofiltre ";
        String services = "Nous offrons les services suivants : gardiennage, laverie...";
        String warning = "Vite, il ne reste plus beaucoup de place";
        System.out.println(welcomeMessage);
        System.out.println(services);
        System.out.println(warning.toUpperCase());
    }
}
