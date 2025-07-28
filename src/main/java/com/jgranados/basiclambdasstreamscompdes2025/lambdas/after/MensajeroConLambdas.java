package com.jgranados.basiclambdasstreamscompdes2025.lambdas.after;

/**
 * StreamsAndLambdasBasics
 * @author jose - 24.07.2025 
 * @Title: MensajeroConLambdas
 * @Description: description
 *
 * Changes History
 */
public class MensajeroConLambdas {

    public void decirMensaje(ComportamientoMensaje comportamiento) {
        comportamiento.ejecutar();
    }

    public static void main(String[] args) {

        MensajeroConLambdas mensajero = new MensajeroConLambdas();

        ComportamientoMensaje comportamientoMensaje1 = (/*parametros */) -> System.out.println("Hola Mundo!!!");

        ComportamientoMensaje comportamientoMensaje2 = () -> {
            System.out.println("Hola Mundo!!!");
            System.out.println("Y Buenos dias");
        };

        mensajero.decirMensaje(comportamientoMensaje1);
        mensajero.decirMensaje(comportamientoMensaje2);

        mensajero.decirMensaje(() -> System.out.println("HOla a todos en JCONF!!!"));

        InterfazNumeros implementacion1 = (int x, int b) -> System.out.println("suma: " + (x + b));

    }
}