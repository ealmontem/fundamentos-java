package com.elvisalmonte.comoprogramarenjava.herencia;

public class EmpleadoPorComision extends Object {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;


    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision) {

        // la llamada implícita al constructor predeterminado de Object ocurre aquí
        // si ventasBrutas no es válida, lanza excepción
        if (ventasBrutas <= 0.0)
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0"
            ) ;




        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }




}
