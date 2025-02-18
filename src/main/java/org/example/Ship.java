package org.example;

public class Ship implements ITransport{
    @Override
    public void deliver() {
        System.out.println("A Ship make delivery");
    }
}