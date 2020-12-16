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
public class Usuario {

    private String nombre;
    private String contraseña;
    private String sexo;

    public Usuario() {

    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Usuario(Usuario u) {
        this.nombre = u.nombre;
        this.contraseña = u.contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Usuario registrarUsuario() {
        Usuario u = new Usuario();
        System.out.println("Introduce el nombre de usuario");
        Scanner in = new Scanner(System.in);
        String usuario = in.nextLine();
        u.setNombre(usuario);
        System.out.println("Introduce la contraseña");
        String pass = in.nextLine();
        u.setContraseña(pass);
        int n;
        do {
            System.out.println("Sexo, 1 para Masculino o 2 para Femenino");
            n = in.nextInt();
            String sx;
            switch (n) {
                case 1:
                    System.out.println("Has elegido el sexo masculio");
                    sx = "Masculino";
                    u.setSexo("Masculino");
                    break;
                case 2:
                    System.out.println("Has elegido el sexo femenino");
                    sx = "Femenino";
                    u.setSexo("Femenino");
                    break;
                default:
                    System.out.println("Debe introducir el sexo");
            }

        } while (n != 1 && n != 2);
        System.out.println("Registro completado!");
    return u;}
    
    public Usuario iniciarsesionUsuario(){
        Usuario a = new Usuario();
        System.out.println("Introduzca su Usuario para iniciar sesion");
        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine();
        a.setNombre(nombre);
        System.out.println("Introduzca su contraseña");
        String pass = in.nextLine();
        a.setContraseña(pass);
    return a;}
}
