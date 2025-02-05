package com.elvisalmonte.comoprogramarenjava.herencia;

public class PruebasEmpleadosComsion {
    public static void main(String[] args) {
        // crea instancia de objeto EmpleadoPorComision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Sue","Jones","222", 1000.0,.06);
        // obtiene datos del empleado por comisión
        System.out.println("Informacion del empleado obtenida por los metodos establecer:");
        System.out.printf("%n%s %s%n", "El primer nombre es",
                empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "El apellido Paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El numero de seguridad social es", empleado.getNumeroSeguroSocial());
        System.out.printf("%s %s%n", "El apellido Paterno es", empleado.getApellidoPaterno());
        System.out.printf("%s %.2f%n", "Las ventas brutas es", empleado.getVentasBrutas());
    }
}
