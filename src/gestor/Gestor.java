/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import Modelo.Cliente;
import Modelo.Coleccion;
import java.util.HashMap;

/**
 *
 * @author lokita
 */
public class Gestor {
        Coleccion col;
    public void grabar(String dni,String nom,String sex,String est,String lin){
        Cliente cli=new Cliente();
        cli.setDni(dni);
        cli.setNom(nom);
        cli.setSex(sex);
        cli.setEst(est);
        cli.setLin(Double.parseDouble(lin));
        
        col=new Coleccion();
        col.grabar(cli);
    
    }
    public HashMap verLineas(){
        return col.getLineas();
    
    }
}
