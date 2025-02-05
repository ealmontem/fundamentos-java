package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

public class Piloto {
    private String nombre;
    private String apellido;
    private Direccion direccion;


    public Piloto(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
