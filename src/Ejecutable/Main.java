/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import Entidades.Usuario;
import Entidades.Utilidades;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //
        Usuario[] usuarios = Utilidades.USUARIOS;
        boolean cond = false;

        do {
            Usuario u = new Usuario();
            System.out.println("Introduzca su Usuario para iniciar sesion");
            Scanner in = new Scanner(System.in);
            String nombre = in.nextLine();
            System.out.println("Introduzca su contraseña");
            String pass = in.nextLine();
            for (Usuario usuario : usuarios) {
                u = usuario;
                if (pass.equals(u.getContraseña()) && nombre.equals(u.getNombre())) {
                    cond = true;
                }
            }
            if (!cond) {
                System.out.println("Tu usuario y contraseña es/son incorrectas");
            }
            if (cond) {
                System.out.println("Has iniciado sesion");
            }
        } while (!cond);
    }
}
