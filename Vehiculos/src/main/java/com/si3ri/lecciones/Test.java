package main.java.com.si3ri.lecciones;

public class Test {
    public static void main(String[] args) {

        /* CLASE VEHICULOS */
        Vehiculos moto = new Vehiculos(); // Estancia de la clase 'Vehiculo' llamada 'moto'.
        moto.Arrancar(); // Se llama al método arrancar...
        moto.setNoLlantas(2); // Se llama al método 'SET' parara inicializar '2'.
        moto.setTipoVehiculo("Motocicleta"); // Se llama al método 'SET' parara inicializar con 'Motocicleta'.
        System.out.println(moto.getTipoVehiculo());
        System.out.println(moto.getNoLlantas());

        /* CLASE MATEMATICAS */
        Matematicas test = new Matematicas(); //Instancia de la clase 'Matematicas'.
        System.out.println(test.multiplicar(2, "Su resultado es: "));
        System.out.println(test.multiplicar(4, "Su resultado es: "));

    }
}