/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alex
 */
class Puntuacion {
    
    private int npuntos;
    private Equipo equipo;
    
    public Puntuacion(){
        
    }
    
    public Puntuacion(int npuntos, Equipo equipo){
        this.npuntos = npuntos;
        this.equipo = equipo;
    }
    
    public Puntuacion(Puntuacion p){
        this.npuntos = p.npuntos;
        this.equipo = p.equipo;
    }

    public int getNpuntos() {
        return npuntos;
    }

    public void setNpuntos(int npuntos) {
        this.npuntos = npuntos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
      
}
