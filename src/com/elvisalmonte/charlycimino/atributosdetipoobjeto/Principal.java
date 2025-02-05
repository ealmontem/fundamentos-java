package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

import java.io.PipedInputStream;

public class Principal {
    public static void main(String[] args) {
        Pais pais = new Pais("3223", "Republica Dominicana");
        Direccion direccion = new Direccion("Padre Castellano #16", "Bonao", pais);
        Motor motor = new Motor("3322", 2.2, "Gasolina","Toyota Racing");
        Auto a = new Auto("XXZY73", "Toyota", 233.2, "Negro", motor, new Piloto("Elvis", "Almonte", direccion));
        System.out.println(a);


    }
}
