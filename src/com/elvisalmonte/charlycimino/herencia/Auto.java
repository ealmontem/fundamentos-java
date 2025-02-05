package com.elvisalmonte.charlycimino.herencia;

public class Auto extends Vehiculo{
   private boolean tieneAire;
   public void prenderAire(){
        if (tieneAire){
            System.out.println("Encendiendo aire....");
        }
    }
}
