package com.elvisalmonte.charlycimino.herencia.mostraprotected;

import com.elvisalmonte.charlycimino.herencia.vehiculos.Vehiculo;

public class OtraClase  {
    public OtraClase(){
        Vehiculo v = new Vehiculo();
        v.acelerar();
        v.encender();
        v.frenar();
        //
        //System.out.println(v.marca);
    }
}
