package com.mycompany.ordenesdecompras;

import java.util.Scanner;

/**
 * Esta clase implementa la vista de la aplicación.
 */
public class App {
    private Ordenes ordenes;
    private Scanner scanner;


    public App() {
        ordenes = new Ordenes();
        scanner = new Scanner(System.in);
    }

    /**
     * Este método lee los datos de una orden y la añade a la cola de ordenes.
     */
    private void añadirOrden() {
        System.out.print("Escriba el nombre del cliente: ");
        String nombreDelCliente = scanner.nextLine();
        System.out.print("Escriba la cantidad de productos: ");
        int cantidadDeProductos = Integer.parseInt(scanner.nextLine());
        Orden orden = new Orden(nombreDelCliente, cantidadDeProductos);
        ordenes.insertar(orden);
    }

    /**
     * Este método muestra las ordenes en la cola.
     */
    private void mostrarOrdenes() {
        System.out.println(ordenes);
    }

    /**
     * Este método muestra la cantidad de ordenes en la cola.
     */
    private void mostrarCantidadDeOrdenes() {
        System.out.println("Cantidad de ordenes: " + ordenes.getCantidadDeOrdenes());
    }

    /**
     * Este método elimina una orden de la cola.
     */
    private void eliminarOrden() {
        Orden orden = ordenes.eliminar();
        System.out.println("Orden procesada: " + orden);
    }

    /**
     * Este método muestra el menú de la aplicación.
     */
    private void mostrarMenu() {
        System.out.println("1. Añadir orden");
        System.out.println("2. Mostrar ordenes");
        System.out.println("3. Mostrar cantidad de ordenes");
        System.out.println("4. Eliminar orden");
        System.out.println("5. Salir");
    }

    /**
     * Este método ejecuta una opción del menú.
     * @param opción La opción a ejecutar.
     */
    private void ejecutarOpción(int opción) {
        switch (opción) {
            case 1:
                añadirOrden();
                break;
            case 2:
                mostrarOrdenes();
                break;
            case 3:
                mostrarCantidadDeOrdenes();
                break;
            case 4:
                eliminarOrden();
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    /**
     * Este método inicia la aplicación.
     */
    public void iniciar() {
        while (true) {
            mostrarMenu();
            System.out.print("Escriba una opción: ");
            int opción = Integer.parseInt(scanner.nextLine());
            ejecutarOpción(opción);
        }
    }
}
