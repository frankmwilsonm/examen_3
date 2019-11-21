/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.subprogramas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Laboratorio 7
 */
public class LeerTeclado {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public int leer(int dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public String leer(String dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=br.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }    
    public double leer(double dato, String mensaje){
        System.out.println(mensaje);
        try {
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
}
