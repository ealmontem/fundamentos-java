package com.elvisalmonte.charlycimino.relacionfacturacion;

public class Empresa {
    private String nombre;
    private Direccion direccion;

    public Empresa(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
