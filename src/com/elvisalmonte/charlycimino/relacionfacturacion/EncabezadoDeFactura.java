package com.elvisalmonte.charlycimino.relacionfacturacion;

import java.util.ArrayList;
import java.util.Date;

public class EncabezadoDeFactura {
    private int numeroFactura;
    private String fechaFactura;
    private Cliente cliente;
    //private ArrayList<Producto>items;


    public EncabezadoDeFactura(int numeroFactura, String fechaFactura, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



}
