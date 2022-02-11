/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3fabricio;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Progra
 */
public class Menu {    
    private ArrayList<String> listaMenu = new ArrayList<>();
    private int icono;
    private static int contador = 0 ;
    public Menu(int tipoIcono, String...lista)
    {
        listaMenu.add("Clientes");  
        listaMenu.addAll(Arrays.asList(lista));
        
        icono = tipoIcono;
        contador++;
    }
    
        public ArrayList<String> getListaMenu() {
        return listaMenu;
    }

        
    public void imprimirMenu(){
        if (icono == 1) 
        {
            listaMenu.forEach(opcMenu -> {
                System.out.println((listaMenu.indexOf(opcMenu)+1) + "." + opcMenu);
            });
        }else{
            listaMenu.forEach(opcMenu -> {
                System.out.println( (char)(listaMenu.indexOf(opcMenu)+97) + "." + opcMenu);
            });
        }
        
    }    
        
        
    public void setListaMenu(ArrayList<String> listaMenu) {
        this.listaMenu = listaMenu;
    }

    public int getTipoIcono() {
        return icono;
    }

    public void setTipoIcono(int tipoIcono) {
        this.icono = tipoIcono;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Menu.contador = contador;
    }
}
