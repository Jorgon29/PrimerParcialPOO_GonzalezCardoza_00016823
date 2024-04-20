package Articulo;
import Contador.Contador;
public class Monitor extends Articulo implements  EnVenta{
 private float tasaRefresco;
 private String resolucion;

    public Monitor(String resolucion, float tasaRefresco, String marca, String modelo, String nombre, float precio){
        this.tasaRefresco = tasaRefresco;
        this.resolucion = resolucion;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setNombre(nombre);
        this.setId(Contador.nuevoId());
        this.setPrecio(precio);
    }

    public float getTasaRefresco() {
        return tasaRefresco;
    }

    public void setTasaRefresco(float tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String obtenerDescripcion(){
        String descripcion;
        descripcion = "ID -> " + getId() + "\n"
                + "Nombre -> " + getNombre() + "\n"
                + "Marca -> " + getMarca() + "\n"
                + "Modelo -> " + getModelo() + "\n"
                + "Tasa de refresco -> " + this.tasaRefresco + "\n"
                + "Resolucion -> " + this.resolucion + "\n" +
                "Precio -> " + getPrecio();
        return descripcion;
    }

    public void mostrarDescripcion(){
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
