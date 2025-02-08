package com.elvisalmonte.charlycimino.ejerciciopromediosumatoria;

public class Auto {
    private String marca;
    private String color;
    private boolean puedeMostrarse = false;

    public Auto(String marca, String color, boolean puedeMostrarse){
        this.marca = marca;
        this.color = color;
        this.puedeMostrarse = puedeMostrarse;
    }

    public boolean isPuedeMostrarse() {
        return puedeMostrarse;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
