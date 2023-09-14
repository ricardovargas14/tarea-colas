package com.mycompany.ordenesdecompras;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Esta clase implementa el controlador de la aplicación.
 */
public class Ordenes {
    private Queue<Orden> ordenes;


    public Ordenes() {
        ordenes = new LinkedList<>();
    }

    /**
     * Este método añade una orden a la cola.
     * @param orden Orden a añadir.
     */
    public void insertar(Orden orden) {
        ordenes.add(orden);
    }

    /**
     * Este método elimina una orden de la cola.
     * @return Orden eliminada.
     */
    public Orden eliminar() {
        return ordenes.poll();
    }

    /**
     * Este método devuelve la cantidad de ordenes en la cola.
     * @return Cantidad de ordenes.
     */
    public int getCantidadDeOrdenes() {
        return ordenes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object ordenes[] = this.ordenes.toArray();
        if (ordenes.length == 0) {
            return "No hay ordenes";
        }
        for (int i = 0; i < ordenes.length; i++) {
            String linea = String.format("%3d.- %s", i + 1, ordenes[i]);
            sb.append(linea);
            if (i < ordenes.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    
}
