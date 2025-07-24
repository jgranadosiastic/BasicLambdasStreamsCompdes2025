package com.jgranados.basiclambdasstreamscompdes2025.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 28.03.2020 
 * @Title: MensajeHolaATodos
 * @Description: description
 *
 * Changes History
 */
public class MensajeHolaATodos implements Mensaje {

    @Override
    public void ejecutar() {
        System.out.println("HOLA");
        System.out.println("A TODOS!!!");
    }

}
