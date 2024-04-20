package Articulo;
import Contador.Contador;
public class Laptop extends Articulo implements EnVenta{
    private float ram;
    private String cpu;

    public Laptop(float ram, String cpu, String marca, String modelo, String nombre, float precio) {
        this.ram = ram;
        this.cpu = cpu;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setNombre(nombre);
        this.setId(Contador.nuevoId());
        this.setPrecio(precio);
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String obtenerDescripcion(){
        String descripcion = "ID -> " + getId() + "\n" +
                "Nombre -> " + getNombre() + "\n" +
                "Marca -> " + getMarca() + "\n" +
                "Modelo -> " + getModelo() + "\n" +
                "Ram -> " + ram + "\n" +
                "Cpu -> " + cpu + "\n" +
                "Precio -> " + getPrecio();
        return descripcion;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println(obtenerDescripcion());
    }

    public float obtenerPrecio(){
        return 0.0f;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println(obtenerPrecio());
    }
}
