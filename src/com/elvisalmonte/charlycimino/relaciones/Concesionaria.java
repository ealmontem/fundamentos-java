package com.elvisalmonte.charlycimino.relaciones;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();

    }

    public void mostrarAutos(){
        if (autos.isEmpty()){
            System.out.println("No hay autos");
        }else {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println(autos.get(i));
            }
        }
    }

    public void agregarAuto(Auto auto){
        autos.add(auto);
    }

    public String getNombre(){
        return this.nombre;
    }


}
