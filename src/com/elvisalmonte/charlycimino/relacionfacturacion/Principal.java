
package com.elvisalmonte.charlycimino.relacionfacturacion;

public class Principal {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("c/Padre Castellano no. 16", "Bonao");
        Empresa empresa = new Empresa("Grupo Viamar", direccion);

        EncabezadoDeFactura encabezadoDeFactura = new EncabezadoDeFactura(3333, "22/22/24", new Cliente("Elvis","Almonte"));
        System.out.println("********* Empresa *********");
        System.out.println(empresa.getNombre());
        System.out.println(empresa.getDireccion());
        System.out.println("********* Datos de la factura *********");
        System.out.println(encabezadoDeFactura.getNumeroFactura());
        System.out.println(encabezadoDeFactura.getFechaFactura());
        System.out.println(encabezadoDeFactura.getCliente());






    }
}
