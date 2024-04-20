import Articulo.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Articulo> inventario = new ArrayList<Articulo>();
    public static void main(String[] args){


        int opcion = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Bienvenido! Elija una opcion");
                System.out.println("1 - Registrar nuevo producto");
                System.out.println("2 - Modificar un producto");
                System.out.println("3 - Ver un producto");
                System.out.println("4 - Ver todos los productos");
                System.out.println("0 - Salir");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 0:
                        System.out.println("Hasta pronto...");
                        break;
                    case 1:
                        registrarNuevoProducto();
                        break;
                    case 2:
                        modificarProducto();
                        break;
                    case 3:
                        verProducto();
                        break;
                    case 4:
                        verListaProductos();
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;

                }
            } catch (InputMismatchException e){
                System.out.println("Ingrese un valor valido");
            }
        } while (opcion != 0);

    }

    private static void registrarNuevoProducto(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Elija el tipo de articulo a registrar");
                System.out.println("1 - Telefono movil");
                System.out.println("2 - Laptop");
                System.out.println("3 - Monitor");
                System.out.println("4 - Otro");
                System.out.println("5 - Regresar");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        registrarMovil();
                        break;
                    case 2:
                        registrarLaptop();
                        break;
                    case 3:
                        registrarMonitor();
                        break;
                    case 4:
                        registrarOtro();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
        } catch (InputMismatchException e) {
                System.out.println("Ingrese un dato valido");
            }
        }while (opcion != 5);

    }

    private static void registrarMovil(){


        boolean sim;
        String nombre, modelo, marca, simLeer;
        int camaras;
        float almacenamiento;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del movil");
        nombre = sc.nextLine();

        System.out.println("Ingrese la marca del movil");
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo del movil");
        modelo = sc.nextLine();
        System.out.println("Ingrese el almacenamiento (en Gb) del movil");
        almacenamiento = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de camaras del movil");
        camaras = sc.nextInt();
        sc.nextLine();
        System.out.println("Permite dos tarjetas SIM? (s/n)");
        simLeer = sc.nextLine();
        if (simLeer.equals("s")){
            sim = true;
        } else if (simLeer.equals("n")){
            sim = false;
        } else {
            System.out.println("No se pudo crear el movil");
            return;
        }
        System.out.println("Ingrese el precio");
        float precio = sc.nextFloat();
        Articulo nuevoMovil = new TelefonoMovil(sim, almacenamiento, camaras, nombre, marca, modelo, precio);
        inventario.add(nuevoMovil);
        System.out.println("Telefono agregado exitosamente !!");

    }

    private static void registrarLaptop(){

        String nombre, modelo, marca, cpu;
        float ram;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la laptop");
        nombre = sc.nextLine();

        System.out.println("Ingrese la marca de la laptop");
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo de la laptop");
        modelo = sc.nextLine();
        System.out.println("Ingrese la ram (en Gb) de la laptop");
        ram = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el cpu de la laptop");
        cpu = sc.nextLine();
        System.out.println("Ingrese el precio");
        float precio = sc.nextFloat();


        Articulo nuevaLaptop = new Laptop(ram, cpu, marca, modelo, nombre, precio);
        inventario.add(nuevaLaptop);
        System.out.println("Laptop agregada exitosamente !!");
    }
    private static void registrarMonitor(){
        String nombre, modelo, marca;
        float tasaRefresco;
        int alto, ancho;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del monitor");
        nombre = sc.nextLine();

        System.out.println("Ingrese la marca del monitor");
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo del monitor");
        modelo = sc.nextLine();
        System.out.println("Ingrese la tasa de refresco (en Hz) del monitor");
        tasaRefresco = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el alto (en pixeles) del monitor");
        alto = sc.nextInt();
        sc.nextLine();
        System.out.println("Inrgrese el ancho (en pixeles) del monitor");
        ancho = sc.nextInt();
        System.out.println("Ingrese el precio");
        float precio = sc.nextFloat();

        Articulo nuevoMonitor = new Monitor(ancho + "x" + alto, tasaRefresco, marca, modelo, nombre, precio);
        inventario.add(nuevoMonitor);
        System.out.println("Monitor agregado exitosamente !!");
    }

    private static void registrarOtro(){
        String nombre, modelo, marca;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del articulo");
        nombre = sc.nextLine();

        System.out.println("Ingrese la marca del articulo");
        marca = sc.nextLine();

        System.out.println("Ingrese el modelo del articulo");
        modelo = sc.nextLine();
        System.out.println("Ingrese el precio");
        float precio = sc.nextFloat();

        Articulo nuevoOtro = new Otro(marca, modelo, nombre, precio);
        inventario.add(nuevoOtro);
        System.out.println("Articulo agregado exitosamente !!");
    }

    private static void modificarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del producto a modificar");
        int buscar = sc.nextInt();
        sc.nextLine();
        for (Articulo art : inventario){
            if (buscar == art.getId()){
                System.out.println("Ingrese el nuevo nombre del articulo");
                String nuevoNombre = sc.nextLine();
                art.setNombre(nuevoNombre);
            }
        }
    }

    private static void verProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del articulo a ver");
        int buscar = sc.nextInt();
        for (Articulo art : inventario){
            if (buscar == art.getId()){
                art.mostrarDescripcion();
                return;
            }
        }
        System.out.println("No se encontro el articulo");
    }

    private static void verListaProductos(){
        for (Articulo art : inventario){
                art.mostrarDescripcion();
                return;
    }
    }

}
