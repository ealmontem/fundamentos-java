package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

public class Pais {
    private String codigoPais;
    private String descripcion;


    public Pais(String codigoPais, String descripcion) {
        this.codigoPais = codigoPais;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigoPais='" + codigoPais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
