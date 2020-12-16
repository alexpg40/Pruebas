/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import Entidades.Usuario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.registrarUsuario();
        Usuario a = new Usuario();

        String usuarios[][] = new String[10][2];
        usuarios[6][0] = "A";
        usuarios[6][1] = "123";

        System.out.println("Introduzca su Usuario para iniciar sesion");
        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine();
        System.out.println("Introduzca su contraseña");
        String pass = in.nextLine();
        for (int i = 0; i < usuarios.length; i++) {
            if (nombre.equals(usuarios[i][0]) && pass.equals(usuarios[i][1])) {
                System.out.println("Has iniciado sesion");
            }
        }
    }
}
