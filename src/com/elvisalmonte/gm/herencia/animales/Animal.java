package com.elvisalmonte.gm.herencia.animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

class Perro extends Animal{

   public void hacerSonido(){
        System.out.println("Gau Gau");
    }

}


class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("Clase Padre, Soy un animal");
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(); //no existe en la clase padre solo existe en la clase hija
        System.out.println("\nClase Hija, soy un Perro");
        Perro perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

    }
}



