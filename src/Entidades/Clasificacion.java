/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Clasificacion {
    
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Puntuacion> puntuacion = new ArrayList<>();
    private ArrayList<Gol> goles = new ArrayList<>();
    
    public Clasificacion(){
        
    }
    
    public Clasificacion(ArrayList<Equipo> equipos, ArrayList<Puntuacion> puntuacion, ArrayList<Gol> goles){
        this.equipos = equipos;
        this.puntuacion = puntuacion;
        this.goles = goles;
    }
    
    public Clasificacion(Clasificacion c){
        this.equipos = c.equipos;
        this.puntuacion = c.puntuacion;
        this.goles = c.goles;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Puntuacion> getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(ArrayList<Puntuacion> puntuacion) {
        this.puntuacion = puntuacion;
    }

    public ArrayList<Gol> getGoles() {
        return goles;
    }

    public void setGoles(ArrayList<Gol> goles) {
        this.goles = goles;
    }
   
}
