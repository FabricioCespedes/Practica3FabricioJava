/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica3fabricio;

/**
 *
 * @author Progra
 */
public class Cliente {

    /**
     * Constructor de la cliente debe agregar todos los datos menos la edad, la edad se agrega por separado.
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param identificacion 
     */
    public Cliente(String nombre, String apellido1, String apellido2, String identificacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificacion = identificacion;
    }
    String nombre;
    String apellido1;
    String apellido2;
    String identificacion;
    int edad;

    /**
     * Constructor vacio.
     */
    public Cliente()
    {}
    
    /**
     * Método obtener del nombre de la clase cliente.
     * @return Contiene el nombre de un cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la clase cliente.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna el apellido de un cliente.
     * @return Contiene el apellido de un cliente.
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Método que establece el primer apellido del cliente.
     * @param apellido1 
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Método que retorna el segundo apellido de un cliente.
     * @return Segundo apellido de un cliente.
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Método que establece el segundo apellido de un cliente.
     * @param apellido2 
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Método que retorno la identificación del cliente.
     * @return Retorna la identificación de un cliente.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Método que establece la identificación del cliente.
     * @param identificacion 
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Método que retorna la edad de un cliente.
     * @return 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que establece la edad de un cliente, solo se permiten edad mayores a 18 años, retorna si se guardo o no. 
     * @param edad
     * @return Retorna un mensaje de confirmación de guardado.
     */
    public String setEdad(int edad) {
        String msj = "Guardado exito";
        if (edad >= 18) {
            this.edad = edad;
        }else{
            msj = "No se permiten guardar edades a menores, la edad no se ha guardado";
        }
        return msj;
    }
    
    /**
     * Método que retorna un saludo al cliente.
     * @return 
     */
    public String saludar()
    {
        return "Hola " + nombre;
    }
    
    /**
     * Método que no establece ni retorna nada.
     */
    public void hablar(){
        //hola
    }
}
