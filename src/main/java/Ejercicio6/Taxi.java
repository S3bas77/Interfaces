package Ejercicio6;

public class Taxi implements TransportePublico{
    private Conductor conductor;

    public Taxi(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public void iniciarViaje(String origen, String destino) {
        conductor.aceptarPasajero();
        System.out.println("Iniciando viaje en taxi desde " + origen + " hasta " + destino);
    }

    @Override
    public double calcularTarifa() {
        return 10.5; // Tarifa base
    }

    public void finalizarViaje() {
        conductor.finalizarViaje();
        System.out.println("Viaje en taxi finalizado.");
    }
}
