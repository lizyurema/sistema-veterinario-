/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author lokita
 */
public class Coleccion {
        private HashMap lineas = new HashMap();
        public void grabar(Cliente cli){
            lineas.put(cli.getDni(), cli);
        
        }

    public HashMap getLineas() {
        return lineas;
    }
    
}
