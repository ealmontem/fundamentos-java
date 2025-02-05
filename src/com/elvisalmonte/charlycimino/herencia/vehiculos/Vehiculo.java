package com.elvisalmonte.charlycimino.herencia.vehiculos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String patente;


   public void acelerar(){
       System.out.println(marca);
       System.out.println(modelo);
       System.out.println(patente);
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
