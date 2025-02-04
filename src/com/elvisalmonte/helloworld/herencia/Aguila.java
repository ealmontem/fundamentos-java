package com.elvisalmonte.helloworld.herencia;

public class Aguila extends Ave{
    public Aguila(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void volar(){
        System.out.println("Si puedo volar");
    }



}
