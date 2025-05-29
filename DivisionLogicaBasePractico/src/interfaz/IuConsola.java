package interfaz;

import java.util.ArrayList;
import logica.ControlClientes;

import logica.Cliente;
import logica.ControlStock;
import logica.Factura;
import logica.PracticoException;
import logica.Producto;
import logica.Proveedor;

import utilidades.Consola;

public class IuConsola {

    ControlClientes controlClientes = ControlClientes.getInstancia();
    ControlStock controlStock = ControlStock.getInstancia();

    /**
     * Ejecuta la consola
     */
    public void mostrarConsola() {
        boolean salir = false;
        do {

            int opcion = imprimirMenu();
            salir = procesarOpcion(opcion);

        } while (!salir);
    }

    /**
     * Imprime el menú y sus opciones a pantalla
     */
    private int imprimirMenu() {
        System.out.println("MENU");
        System.out.println("====");

        ArrayList<String> opciones = new ArrayList();
        opciones.add("Alta de Cliente"); //opcion 0
        opciones.add("Alta de Producto"); //opcion 1
        opciones.add("Salir del menú"); //opcion 2

        return Consola.menu(opciones);
    }

    /**
     * Captura la opción seleccionada por el usuario y ejecuta la acción
     * correspondiente
     */
    private boolean procesarOpcion(int opcion) {
        boolean salir = false;

        switch (opcion) {
            case 0:
                this.nuevoCliente();
                break;
            case 1:
                this.nuevoProducto();
                break;
            case 2:
                salir = true;
                break;

        }
        return salir;
    }

    private void nuevoCliente() {

        System.out.println("ALTA DE CLIENTE");
        System.out.println("===============");

        Cliente unCliente = new Cliente();
        boolean ok = false;
        do {
            ok = unCliente.setCedula(Consola.leer("Cedula:"));
            if (!ok) {
                System.out.println("Cedula incorrecta");
            }
        } while (!ok);

        unCliente.setNombre(Consola.leer("Nombre:"));

        if (controlClientes.agregar(unCliente)) {
            mostrarClientes();
        } else {
            System.out.println("EL CLIENTE NO FUE INGRESADO");
        }

    }

    private void mostrarClientes() {
        System.out.println("=================");
        System.out.println("CLIENTES ACTUALES");
        System.out.println("=================");
        ArrayList<Cliente> clientes = controlClientes.getClientes();
        for (Cliente c : clientes) {
            System.out.println(c.getCedula() + " - " + c.getNombre());
        }
    }

    private void nuevoProducto() {
        System.out.println("ALTA DE PRODUCTO");
        System.out.println("===============");

        ArrayList<Proveedor> proveedores = controlStock.getProveedores();

        boolean ok = false;
        do {

            Producto unProducto = new Producto();

            try {
                String nombre = Consola.leer("Nombre de Producto:\n");
                unProducto.setNombre(nombre);

                try {
                    int unidades = Consola.leerInt("Ingresa las cantidades\n");

                    int opcion = Consola.menu(proveedores);
                    Proveedor prov = proveedores.get(opcion);
                    System.out.println("proveedor elegido: " + prov.getNombre());
                    float precio = (float) Consola.leerInt("Ingresa el precio: \n");

                    //Producto unProducto = new Producto(nombre, precio, unidades, prov);
                } catch (Exception e) {
                }

            } catch (PracticoException e) {
                Consola.println(e.getMessage());
                ok = false;
            }

        } while (!ok);

//        unCliente.setNombre(Consola.leer("Nombre:"));
//
//        if (controlClientes.agregar(unCliente)) {
//            mostrarClientes();
//        } else {
//            System.out.println("EL CLIENTE NO FUE INGRESADO");
//        }
    }

}
