package Contador;

public class Contador {
    static long contador = 0;
    public static long nuevoId(){
        return contador++;
    }
}
