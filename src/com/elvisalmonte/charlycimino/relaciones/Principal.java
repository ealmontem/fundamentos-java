package com.elvisalmonte.charlycimino.relaciones;

public class Principal {
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria("Grupo Viamar, S.A");
       // c.mostrarAutos();
        System.out.println(c.getNombre());
        c.agregarAuto(new Auto("Ford Mustang", "Rojo"));
        c.agregarAuto(new Auto("Ford Explorer", "Negro"));
        c.mostrarAutos();



    }
}
