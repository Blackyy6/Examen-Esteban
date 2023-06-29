/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfacturas;

/**
 *
 * @author Jeremy
 */
public class DeudaCliente {
    private String nombreCliente;
    private String cedulaCliente;
    private String numeroFactura;
    private double montoFactura;
    private int mesFactura;
    private int YearFactura;
    private String estadoFactura;

    public DeudaCliente(String nombreCliente, String cedulaCliente, String numeroFactura, double montoFactura, int mesFactura, int YearFactura) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.numeroFactura = numeroFactura;
        this.montoFactura = montoFactura;
        this.mesFactura = mesFactura;
        this.YearFactura = YearFactura;
        this.estadoFactura = "No pagada";
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMesFactura() {
        return mesFactura;
    }

    public void setMesFactura(int mesFactura) {
        this.mesFactura = mesFactura;
    }

    public int getYearFactura() {
        return YearFactura;
    }

    public void setYearFactura(int YearFactura) {
        this.YearFactura = YearFactura;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(String estadoFactura) {
        this.estadoFactura = estadoFactura;
    }


    
    public String toString() {
        return "Nombre del cliente: " + nombreCliente +
                "\nCédula del cliente: " + cedulaCliente +
                "\nNúmero de factura: " + numeroFactura +
                "\nMonto de la factura: " + montoFactura +
                "\nMes de la factura: " + mesFactura +
                "\nAño de la factura: " + YearFactura +
                "\nEstado de la factura: " + estadoFactura +
                "\n";
    }
}
