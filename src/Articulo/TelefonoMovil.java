package Articulo;
import Contador.Contador;

public class TelefonoMovil extends Articulo implements EnVenta{
    private boolean dualSim;
    private float almacenamiento;
    private int cantidadCamaras;

    public TelefonoMovil(boolean dualSim, float almacenamiento, int cantidadCamaras, String nombre, String marca, String modelo, float precio) {
        this.dualSim = dualSim;
        this.almacenamiento = almacenamiento;
        this.cantidadCamaras = cantidadCamaras;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setNombre(nombre);
        this.setId(Contador.nuevoId());
        this.setPrecio(precio);
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }

    public String obtenerDescripcion(){
        String descripcion = "ID -> " + getId() + "\n" +
                "Nombre -> " + getNombre() + "\n" +
                "Marca -> " + getMarca() + "\n" +
                "Modelo -> " + getModelo() + "\n" +
                "Dual sim -> " + dualSim + "\n" +
                "Almacenamiento -> " + almacenamiento + "\n" +
                "Cantidad camaras -> " + cantidadCamaras+ "\n" +
                "Precio -> " + getPrecio();
        return descripcion;
    }

    public void mostrarDescripcion(){
        System.out.println(obtenerDescripcion());
    }
    public float obtenerPrecio(){
        return 0.0f;
    }

    public void mostrarPrecio(){
        System.out.println(obtenerPrecio());
    }
}
