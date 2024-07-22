package main.java.com.si3ri.lecciones;

public class Matematicas {

    int numero1; // Atributos.
    int numero2;

    // Constructor de la clase sin sobrecarga, ni parametros.
    public Matematicas(){
        this.numero1 = 2;
        this.numero2 = 5;
    }

    // Constructor de la clase con sobrecarga y parametros.
    public Matematicas(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public int multiplicar(){
        return numero1*numero2;
    }

    // Sobrecarga de método cambiando uno de los valores a multiplicar.
    public int multiplicar(int numero2){
        return numero1*numero2;
    }

    // Sobrecarga de otro método, agregando un nuevo mensaje.
    public int multiplicar(int numero2, String mensaje){
        System.out.println(mensaje);
        return numero1*numero2;
    }

}
