package com.elvisalmonte.charlycimino.herencia;

public class Principal {
    public static void main(String[] args) {
        Auto a = new Auto();
        Moto m = new Moto();
        a.encender(); //hereda de vehiculo
        //a.tieneAire = true; //atributo propio de auto
        a.encender(); //hereda de vehiculo
        a.prenderAire(); //propio de auto
        a.frenar(); //hereda de vehiculo
        //a.marca = "BMW";

        //m.marca = "Toyota";
        //m.anchoDelManubrio = 33;
        m.acelerar();
        m.hacerwhliee();
        m.setMarca("Honda");
        System.out.println(m.getMarca());

    }
}
