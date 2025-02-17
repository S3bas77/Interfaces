package Ejercicio6;

public class Bus implements TransportePublico {
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("El bus ha partido desde " + origen + " hacia " + destino);
    }

    @Override
    public double calcularTarifa() {
        return 2.0; // Tarifa fija para buses
    }
}
