/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenesdecompras;

/**
 * Esta clase representa una orden de compra.
 */
public class Orden {
    
    private String nombreDelCliente;
    private int cantidadDeProductos;
    
    /**
     * Este constructor inicializa los atributos de la clase.
     * @param nombreDelCliente Nombre del cliente.
     * @param cantidadDeProductos Cantidad de productos.
     */
    public Orden(String nombreDelCliente, int cantidadDeProductos) {
        this.nombreDelCliente = nombreDelCliente;
        this.cantidadDeProductos = cantidadDeProductos;
    }
    
    /**
     * Este método devuelve el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombreDelCliente() {
        return nombreDelCliente;
    }
    
    /**
     * Este método devuelve la cantidad de productos.
     * @return Cantidad de productos.
     */
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    
    /**
     * Este método establece el nombre del cliente.
     * @param nombreDelCliente Nombre del cliente.
     */
    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }
    
    /**
     * Este método establece la cantidad de productos.
     * @param cantidadDeProductos Cantidad de productos.
     */
    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreDelCliente + ", productos: " + cantidadDeProductos;
    }

    
}
