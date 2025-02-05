package com.elvisalmonte.charlycimino.herencia.vehiculos;

public class Auto extends Vehiculo {
   private boolean tieneAire;
   public void prenderAire(){
       System.out.println(marca);
       System.out.println(modelo);
       System.out.println(patente);
        if (tieneAire){
            System.out.println("Encendiendo aire....");
        }
    }
}
