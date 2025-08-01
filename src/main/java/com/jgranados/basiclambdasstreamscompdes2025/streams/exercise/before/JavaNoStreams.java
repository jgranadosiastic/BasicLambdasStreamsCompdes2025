package com.jgranados.basiclambdasstreamscompdes2025.streams.exercise.before;


import com.jgranados.basiclambdasstreamscompdes2025.streams.exercise.TipoTransaccion;
import com.jgranados.basiclambdasstreamscompdes2025.streams.exercise.Transaccion;
import java.util.ArrayList;
import java.util.List;

/**
 * StreamsAndLambdasBasics
 *
 * @author jose - 24.07.2025 
 * @Title: JavaNoStreams
 * @Description: description
 *
 * Changes History
 */
public class JavaNoStreams {

    public static void main(String[] args) {

        List<Transaccion> transacciones = new ArrayList<>();
        transacciones.add(new Transaccion(TipoTransaccion.VENTA, "venta 1", 1000.0));
        transacciones.add(new Transaccion(TipoTransaccion.VENTA, "venta 2", 4000.0));
        transacciones.add(new Transaccion(TipoTransaccion.COMPRA, "compra 1", 20000.0));
        transacciones.add(new Transaccion(TipoTransaccion.DEVOLUCION, "devolucion 1", 500.0));

        // encontrar todas las transacciones tipo VENTA
        List<Transaccion> ventas = new ArrayList<>();
        for (Transaccion transaccion : transacciones) {
            if (TipoTransaccion.VENTA == transaccion.getTipo()) {
                ventas.add(transaccion);
            }
        }

        // mas proceso aqui
        // mostrar las ventas
        for (Transaccion transaccion : ventas) {
            transaccion.imprimir();
        }
    }

}
