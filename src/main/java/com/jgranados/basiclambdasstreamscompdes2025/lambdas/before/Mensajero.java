package com.jgranados.basiclambdasstreamscompdes2025.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 24.07.2025 
 * @Title: Mensajero
 * @Description: description
 *
 * Changes History
 */
public class Mensajero {

    public void decirMensaje() {
        System.out.println("Hola Mundo!!");
        // mas lineas
    }

    public static void main(String[] args) {

        Mensajero mensajero = new Mensajero();
        mensajero.decirMensaje();
    }
}