package com.elvisalmonte.charlycimino.usodedependencia;

public class Principal {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Historia de la Cultura", "Trata sobre la historia universal\n");
        Impresora epsion = new Impresora();
        epsion.encender();
        System.out.println(epsion.isEstaEncendida());
        epsion.configurarImpresora();
        epsion.imprimir(doc1);
    }
}
