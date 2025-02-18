package org.example;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("A truck make delivery");
    }
}
