package com.elvisalmonte.charlycimino.atributosdetipoobjeto;

public class Direccion {
    private String calle;
    private String ciudad;
    private Pais pais;

    public Direccion(String calle, String ciudad, Pais pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
