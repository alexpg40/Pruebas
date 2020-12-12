/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import Entidades.Equipo;
import Entidades.Partido;

public class Main {
    
    public static void main(String[] args){
        
        Equipo a = new Equipo();
        a.nuevoEquipos();
        
        Partido p = new Partido();
        p.nuevoPartido();
        
    }
    
}
