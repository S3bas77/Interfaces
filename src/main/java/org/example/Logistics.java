package org.example;

public abstract class Logistics {
    public void planDelivery() {
        ITransport transport = this.createTransport();
        transport.deliver();
    }
    public abstract ITransport createTransport();
}
