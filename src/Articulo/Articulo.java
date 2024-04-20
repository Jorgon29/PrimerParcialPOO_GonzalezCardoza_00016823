package Articulo;

public abstract class Articulo{
    private String marca;
    private String modelo;
    private String nombre;

    private float precio;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getId() {
        return id;
    }

    protected void setId(double id) {
        this.id = id;
    }

    private double id;



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarDescripcion();

    public abstract void mostrarPrecio();

}
