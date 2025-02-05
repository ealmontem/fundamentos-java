package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

public class Auto {
    private String patentes;
    private String marca;
    private double precio;
    private String color;
    private Motor motor;
    private Piloto piloto;

    public Auto(String patentes, String marca, double precio, String color, Motor motor, Piloto piloto) {
        this.patentes = patentes;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patentes='" + patentes + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                ", piloto=" + piloto +
                '}';
    }
}
