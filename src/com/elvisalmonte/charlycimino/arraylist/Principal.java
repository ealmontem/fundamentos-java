package com.elvisalmonte.charlycimino.arraylist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Auto a1 = new Auto("Toyota", "Blanco");
        Auto a2 = new Auto("Honda", "Negro");
//        Auto a3 = new Auto("Bmw", "Verde");

        ArrayList<Auto> misAutos = new ArrayList<>();
//        misAutos.add(new Auto("toyota", "Blanco"));
//        misAutos.add(new Auto("Honda", "Verde"));
//        misAutos.add(new Auto("Bmw", "Gris"));
//        System.out.println(misAutos.size());
//        System.out.println(misAutos);

        System.out.println("********************************");
        misAutos.add(a1);
        System.out.println(misAutos.size());

        System.out.println("********************************");
        misAutos.add(new Auto("Honda", "Negro"));

        System.out.println(misAutos.size());
        //System.out.println(misAutos);
        System.out.println("********************************");
        misAutos.add(new Auto("Mercedes", "Azul"));

        System.out.println(misAutos.size());
        //System.out.println(misAutos);
        System.out.println("********************************");
        misAutos.add(new Auto("ByD", "Rojo"));

        System.out.println(misAutos.size());
        System.out.println(misAutos);

        //Obtner
        System.out.println("El 2do auto de la lista: " + misAutos.get(1));
        System.out.println("*********************************************");
        System.out.println("Mostrando todos los autos de la lista");
        System.out.println("*********************************************");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion" + "(" + i + ") es: " + misAutos.get(i));

        }
        System.out.println("Ultima longitud: " + misAutos.size());
        System.out.println("**************Borrando un auto de una posicion ***********************");
        misAutos.remove(0);
        System.out.println(misAutos.size());
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion" + "(" + i + ") es: " + misAutos.get(i));

        }
        System.out.println("Primera posicion: " + misAutos.getFirst());
        System.out.println("Ultima posicion: " + misAutos.getLast());
        System.out.println("******************Clear********************");
        //misAutos.clear();
        if (misAutos.isEmpty()){
            System.out.println("la lista esta vacia!");
        }else {
            System.out.println("La lista no esta vacia");
        }
        System.out.println(misAutos.size());
        System.out.println("***********************************");
        //misAutos.remove(a2);
        System.out.println(misAutos.size());
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion" + "(" + i + ") es: " + misAutos.get(i));

        }

    }
}
