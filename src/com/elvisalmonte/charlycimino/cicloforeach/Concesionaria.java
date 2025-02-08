package com.elvisalmonte.charlycimino.cicloforeach;

import com.elvisalmonte.charlycimino.relaciones.Auto;

import java.util.ArrayList;

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
                Auto a = autos.get(i);
                System.out.println(a);
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
