/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenesdecompras;

/**
 *
 * @author ricardo
 */
public class Orden {
    
    private String nombreDelCliente;
    private int cantidadDeProductos;
    
    public Orden(String nombreDelCliente, int cantidadDeProductos) {
        this.nombreDelCliente = nombreDelCliente;
        this.cantidadDeProductos = cantidadDeProductos;
    }
    
    public String getNombreDelCliente() {
        return nombreDelCliente;
    }
    
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    
    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }
    
    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }
}
