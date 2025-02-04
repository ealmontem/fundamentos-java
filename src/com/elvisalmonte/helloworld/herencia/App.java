package com.elvisalmonte.helloworld.herencia;

public class App {
    public static void main(String[] args) {
        Pato pato1 = new Pato("Lucas", 2);
        System.out.println("Nombre: " + pato1.nombre);
        System.out.println("Edad: " + pato1.edad);
        pato1.volar();

        Aguila aguila1 = new Aguila("Brimds", 3);
        System.out.println("Nombre: " + aguila1.nombre);
        System.out.println("Edad: " + aguila1.edad);

        aguila1.volar();



    }
}
