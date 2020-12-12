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
class Gol {
    
    private int golafavor;
    private int golencontra;
    private Equipo equipo;
    private Partido partido;
    
    public Gol(){
        
    }
    
    public Gol(int golafavor, int golencontra, Equipo equipo, Partido partido){
        this.golafavor = golafavor;
        this.golencontra = golencontra;
        this.equipo = equipo;
        this.partido = partido;
    }
    
    public Gol(Gol g){
        this.golafavor = g.golafavor;
        this.golencontra = g.golencontra;
        this.equipo = g.equipo;
        this.partido = g.partido;
    }

    public int getGolafavor() {
        return golafavor;
    }

    public void setGolafavor(int golafavor) {
        this.golafavor = golafavor;
    }

    public int getGolencontra() {
        return golencontra;
    }

    public void setGolencontra(int golencontra) {
        this.golencontra = golencontra;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
   
}
