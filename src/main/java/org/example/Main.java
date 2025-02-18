package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("DELIVERY IN MY OWN CODE.");

        RoadLogistics truck = new RoadLogistics();
        truck.planDelivery();

        SeaLogistics sea = new SeaLogistics();
        sea.planDelivery();
    }
}