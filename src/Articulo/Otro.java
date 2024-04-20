package Articulo;
import Contador.Contador;

public class Otro extends Articulo implements EnVenta{

    public Otro(String marca, String modelo, String nombre, float precio){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setNombre(nombre);
        this.setPrecio(precio);

    }
    public String obtenerDescripcion(){
        String descripcion = "ID -> " + getId() + "\n" +
                "Nombre -> " + getNombre() + "\n" +
                "Marca -> " + getMarca() + "\n" +
                "Modelo -> " + getModelo() + "\n" +
                "Precio -> " + getPrecio();

        return descripcion;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(obtenerDescripcion());
    }

    @Override
    public float obtenerPrecio() {
        return getPrecio();
    }

    public void mostrarPrecio(){
        System.out.println(getPrecio());
    }

}
