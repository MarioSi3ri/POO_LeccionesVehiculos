package main.java.com.si3ri.lecciones;

public class Vehiculos {

    private int noLlantas;
    private String tipoVehiculo;

    public void setTipoVehiculo(String tipoVehiculo) { // Método 'SET'.
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoVehiculo() { // Método 'GET'.
        return tipoVehiculo;
    }

    public void setNoLlantas(int noLlantas) {
        this.noLlantas = noLlantas;
    }

    public int getNoLlantas() {
        return noLlantas;
    }

    public void Arrancar() { // Métodos generales de la clase 'Vehiculo'.
        System.out.println("Estoy Arrancando...");
    }

    private void Encender() {
        System.out.println("Estoy Encendiendo...");
    }

}
