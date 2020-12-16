/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Equipo {
    
    private int id;
    private String nombre;
    private String estadio;
    
    public Equipo(){
        
    }
    
    public Equipo(String nombre, String estadio){
        this.nombre = nombre;
        this.estadio = estadio;
    }
    
    public Equipo(Equipo e){
        this.nombre = e.nombre;
        this.estadio = e.estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo nuevoEquipos(){
        Equipo e = new Equipo();
        System.out.println("¿Cuantos equipos quieres introducir?");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(;n > 0;n--){
            e.setId(n);
            System.out.println("¿Como se llama el equipo?");
            sc = new Scanner(System.in);
            String enombre = sc.nextLine();
            e.setNombre(enombre);
            System.out.println("¿Como se llama el estadio del equipo?");
            sc = new Scanner(System.in);
            String nestadio = sc.nextLine();
            e.setEstadio(estadio);
        }
    return e;}
}
