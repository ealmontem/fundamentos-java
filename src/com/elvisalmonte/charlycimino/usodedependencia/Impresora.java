package com.elvisalmonte.charlycimino.usodedependencia;

public class Impresora {

    private boolean estaEncendida;
    private boolean estaDetenida = true;

    public void encender(){
        estaEncendida = true;
    }

    public void configurarImpresora(){
        estaDetenida = false;
    }

    public void imprimir(Documento documento) {
        if (!estaDetenida) {
            if (estaEncendida) {
                System.out.println("Imprimiendo documento " + documento.getTitulo());
                System.out.println("***********************************************");
                System.out.println(documento.getTitulo());
                System.out.println("***********************************************");
            } else {
                System.out.println("Impresora apagada!");
            }
        }else {
            System.out.println("Impresora detenida!");
        }
    }

    public boolean isEstaEncendida() {
        return estaEncendida;
    }
}
