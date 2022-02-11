/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3fabricio;

import static com.mycompany.practica3fabricio.Menu.contador;
import java.util.Scanner;

/**
 *
 * @author Progra
 */
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu utilidad = new Menu(1,"Mantenimiento Clientes","Hola","Adios");
        utilidad.imprimirMenu();
        System.out.println(contador); 
        int opcMenu;
        String opcMen;
        switch(utilidad.icono){
            case 0 -> {                
                opcMenu = (char)entrada.nextLine();
            }
            case 1 -> {
            }
        }

    }
}
