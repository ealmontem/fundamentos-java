package com.elvisalmonte.charlycimino.herencia;

public class Vehiculo {
   private String marca;
   private String modelo;
   private String patente;


   public void acelerar(){
        System.out.println("El Vehiculo esta acelerando....");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    private void chequearMotor() {
        System.out.println("Chequeando motor...");
    }

   public void encender(){
        chequearMotor();
        System.out.println("Encendiendo...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}
