package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

public class Motor {
    private String numero;
    private Double cilindrada;
    private String tipo;
    private String marca;

    public Motor(String numero, Double cilindrada, String tipo, String marca) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "numero='" + numero + '\'' +
                ", cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
