/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.repasoinicio;

/**
 *
 * @author Laboratorio 7
 */
public class InicioCondicional {
    public static void main(String[] args) {
        int a=6; char c='+'; String nombre="David";
        
        if(a!=6 && c=='+' && !nombre.equals("Daniel")){
            System.out.println("todas las condicones cumple");
        }else{
            System.out.println("Una condicon no cumple");
        }
        
        if(c=='*'){
            System.out.println("Multiplicacion");
        }else if(c=='+'){
        System.out.println("Suma");
        }else{System.out.println("No existe"); }
        
        switch(c){
        case '+': { System.out.println("Suma");}break;
        case '*': { System.out.println("Multiplicacion");}break;
        case '-': { System.out.println("Resta");}break;
        case '/': { System.out.println("Division");}break;        
        }
        
    }
}
