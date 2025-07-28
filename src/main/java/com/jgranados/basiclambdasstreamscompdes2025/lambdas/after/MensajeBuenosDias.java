package com.jgranados.basiclambdasstreamscompdes2025.lambdas.after;

import com.jgranados.basiclambdasstreamscompdes2025.lambdas.before.Mensaje;


/**
 * StreamsAndLambdasBasics
 * @author jose - 24.07.2025 
 * @Title: MensajeBuenosDias
 * @Description: description
 *
 * Changes History
 */
public class MensajeBuenosDias implements Mensaje {

    @Override
    public void ejecutar() {
        System.out.println("Buenos dias!!");
    }

}