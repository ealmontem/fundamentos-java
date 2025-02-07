package com.elvisalmonte.charlycimino.arraylist;

public class Auto {
    private String marca;
    private String color;

    public Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
