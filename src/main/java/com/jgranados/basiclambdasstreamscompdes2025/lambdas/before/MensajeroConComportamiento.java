package com.jgranados.basiclambdasstreamscompdes2025.lambdas.before;

/**
 * StreamsAndLambdasBasics
 * @author jose - 24.07.2025 
 * @Title: Mensajero
 * @Description: description
 *
 * Changes History
 */
public class MensajeroConComportamiento /*comportamiento de otros*/ {

    public void decirMensaje(Mensaje mensaje) {
        mensaje.ejecutar();
    }

    public static void main(String[] args) {

        MensajeroConComportamiento mensajero = new MensajeroConComportamiento();

        // este es el que tiene el comportamiento
        Mensaje mensajeHolaMundo = new MensajeHolaMundo();

        Mensaje mensajeHolaTodos = new MensajeHolaATodos();

        // solo recibe al dueño del comportamiento
        mensajero.decirMensaje(mensajeHolaMundo);
        mensajero.decirMensaje(mensajeHolaTodos);
    }
}