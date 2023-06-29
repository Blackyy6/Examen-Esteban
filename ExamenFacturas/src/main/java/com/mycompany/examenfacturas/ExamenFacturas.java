/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenfacturas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamenFacturas {

    public static void main(String[] args) {
        List<DeudaCliente> listaDeudas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean ejecutar = true;
        while (ejecutar) {
            System.out.println("Ingrese los datos de la deuda:");
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la cédula del cliente: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el número de factura: ");
            String numeroFactura = scanner.nextLine();
            System.out.print("Ingrese el monto factura: ");
            double montoFactura = scanner.nextDouble();
            System.out.print("Ingrese el mes factura: ");
            int mesFactura = scanner.nextInt();
            System.out.print("Ingrese elaño  factura: ");
            int YearFactura = scanner.nextInt();
            scanner.nextLine(); 
            DeudaCliente deuda = new DeudaCliente(nombre, cedula, numeroFactura, montoFactura, mesFactura, YearFactura);
            listaDeudas.add(deuda);
            System.out.print("¿Desea ingresar otra deuda? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                ejecutar = false;
            }
        }
        System.out.println("\nLista de deudas:");
        for (DeudaCliente deuda : listaDeudas) {
            System.out.println(deuda.toString());
            int[] facturas = {2810, 2546};
            PagosCliente cliente = new PagosCliente(facturas);
            cliente.generarPlanPagos();
        }
    }
}
