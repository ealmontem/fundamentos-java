package com.elvisalmonte.charlycimino.cicloforeach;

import com.elvisalmonte.charlycimino.relaciones.Auto;

public class Principal {
    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("Grupo Viamar");
        c.agregarAuto(new Auto("Honda", "Blanco"));
        c.agregarAuto(new Auto("Toyota", "Negro"));
        System.out.println(c.getNombre());
        c.mostrarAutos();






    }
}
