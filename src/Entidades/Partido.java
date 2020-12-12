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
public class Partido {

    private String equipolocal;
    private String equipovisitante;
    private int gollocal;
    private int golvisitante;

    public Partido() {

    }

    public Partido(String equipolocal, String equipovisitante, int gollocal, int golvisitante) {
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.gollocal = gollocal;
        this.golvisitante = golvisitante;
    }

    public Partido(Partido p) {
        this.equipolocal = p.equipolocal;
        this.equipovisitante = p.equipovisitante;
        this.gollocal = p.gollocal;
        this.golvisitante = p.golvisitante;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
    }

    public int getGollocal() {
        return gollocal;
    }

    public void setGollocal(int gollocal) {
        this.gollocal = gollocal;
    }

    public int getGolvisitante() {
        return golvisitante;
    }

    public void setGolvisitante(int golvisitante) {
        this.golvisitante = golvisitante;
    }

    public Partido nuevoPartido() {
        Partido part = new Partido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Equipo Local");
        String equipolocal = sc.nextLine();
        part.setEquipolocal(equipolocal);
        System.out.println("Introduzca Equipo Visitante");
        String equipovisitante = sc.nextLine();
        part.setEquipovisitante(equipovisitante);
        System.out.println("¿Cuantos goles ha metido " + equipolocal + "?");
        int goleslocal = sc.nextInt();
        part.setGollocal(goleslocal);
        System.out.println("¿Cuantos goles ha metido " + equipovisitante + "?");
        int golesvisitante = sc.nextInt();
        part.setGolvisitante(golesvisitante);
        if (goleslocal > golesvisitante) {
            System.out.println("Ha ganado el equipo local, " + equipolocal);
        } else if (goleslocal < golesvisitante) {
            System.out.println("Ha ganado el equipo visitante, " + equipovisitante);
        } else {
            System.out.println("Empate entre " + equipolocal + " y " + equipovisitante);
        }
        return part;
    }

}
