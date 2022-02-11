/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3fabricio;

import static com.mycompany.practica3fabricio.Menu.getContador;
import java.util.Scanner;

/**
 *
 * @author Progra
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu utilidad = new Menu(1, "Mantenimiento Clientes", "Hola", "Adios");
        utilidad.imprimirMenu();
        System.out.println("Menu abiertos " + getContador());
        System.out.println("Seleccione una opcion del menu");
        int opcMenu;
        char opcMen;
        switch (utilidad.getTipoIcono()) {
            case 0 -> {
                opcMen = entrada.next().charAt(0);
                if (opcMen == 'a' ) {
                    ingresarUsuario();
                } else {

                    if (((int)opcMen - 97) <= utilidad.getListaMenu().toArray().length && ((int)opcMen - 97) >= 0) {
                        responderSeleccion(opcMen);
                    } else {
                        System.out.println("Opcion invalida");
                    }
                }
            }
            case 1 -> {
                opcMenu = entrada.nextInt();
                if (opcMenu == 1) {
                    ingresarUsuario();
                } else {
                    if (opcMenu <= utilidad.getListaMenu().toArray().length && opcMenu >= 1) {
                        responderSeleccion(opcMenu);
                    } else {
                        System.out.println("Opcion invalida");
                    }
                }
            }
        }

    }

    private static void ingresarUsuario() {
        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite el nombre del cliente");
        cliente.setNombre(entrada.nextLine()) ;
        System.out.println("Por favor digite el primer apellido del cliente");
        cliente.setApellido1(entrada.nextLine());
        System.out.println("Por favor digite el segundo apellido del cliente");
        cliente.setApellido2(entrada.nextLine());
        System.out.println("Por favor digite la identificacion del cliente");
        cliente.setIdentificacion(entrada.nextLine());
        boolean bandera = false;
        while (bandera == false) {
            System.out.println("Por favor digite la edad del cliente");
            int edad = entrada.nextInt();
            String msj = cliente.setEdad(edad);
            if ("Guardado exito".equals(msj)) {
                System.out.println(msj);
                System.out.println(cliente.saludar());
                bandera = true;
            } else {
                System.out.println(msj);
            }
        }
    }

    private static void responderSeleccion(char opcMen) {

        System.out.println("Ha seleccionado la opcion " + opcMen);
        System.out.println("Esta seleccion no se ha implementado");
    }
    
    private static void responderSeleccion(int opcMenu) {

        System.out.println("Ha seleccionado la opcion " + opcMenu);
        System.out.println("Esta seleccion no se ha implementado");  
    }


}
