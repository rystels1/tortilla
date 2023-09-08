/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.iu;

import java.util.Scanner;
import mx.itson.torilla.negocio.Operacion;

/**
 *
 * @author ryst2
 */
public class Main {
    public static void main(String[]arg) {
        System.out.println("Escriba el enciado a separar");
        Scanner scanner =new Scanner(System.in);
        String encunciado=scanner.nextLine();
        String []resultado= new Operacion().separador(encunciado);
        for(String s :resultado){
            System.out.println(s);
        }
    }
    
}
