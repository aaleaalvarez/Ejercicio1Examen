package org.example;

public class Main {
    public static void main(String[] args) {
        GestorBD gestorBD = new GestorBD();
/*
        gestorBD.insertarCliente(new Cliente(1L, "Cliente 1", 80L, true));
        gestorBD.insertarCliente(new Cliente(2L, "Cliente 2", 4L, true));
        gestorBD.insertarCliente(new Cliente(3L, "Cliente 3", 30L, false));
        gestorBD.insertarCliente(new Cliente(4L, "Cliente 4", 10L, true));
        gestorBD.insertarCliente(new Cliente(5L, "Cliente 5", 25L, false));
 */

        gestorBD.getCliente(1L);
        gestorBD.getCliente(2L);
        gestorBD.getCliente(3L);
        gestorBD.getCliente(4L);
        gestorBD.getCliente(5L);

        gestorBD.estadisticas();

        Long totalVentas = gestorBD.obtenerTotalVentas();
        System.out.println("Total de ventas: " + totalVentas);

        Double promedioActivos = gestorBD.obtenerPromedioVentasActivos();
        System.out.println("Promedio de ventas de los activos: " + promedioActivos);

        Long clientesInactivosVentas = gestorBD.contarClientesInactivosConVentas();
        System.out.println("Clientes inactivos con ventas: " + clientesInactivosVentas);

        System.out.println("Listado de mejores clientes (mas de 10 ventas");
        gestorBD.listarMejoresClientes(10L);

        gestorBD.close();
    }
}