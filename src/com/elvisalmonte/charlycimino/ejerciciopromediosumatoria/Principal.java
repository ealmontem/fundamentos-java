package com.elvisalmonte.charlycimino.ejerciciopromediosumatoria;


public class Principal {
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("Grupo Viamar");
        Auto a1 = new Auto("Honda", "Negro", true);
        Auto a2 = new Auto("Toyota", "Blanco", false);
        System.out.println(c.getNombre());
        c.agregarAuto(a1);
        c.agregarAuto(a2);
        c.mostrarAutos();







    }
}
