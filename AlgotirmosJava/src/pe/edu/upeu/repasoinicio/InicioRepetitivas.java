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
public class InicioRepetitivas {
    public static void main(String[] args) {
        //for
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dato:"+i);
        }
        for (int i = 10; i >=1; i--) {
            System.out.println("Dato:"+i);
        }
        System.out.println("-----------------");
        for (int i = 0; i <=20; i=i+2) {
            System.out.println("Dato:"+i);
        }
        //while
        //necesito un contador o acumuladores
        int a=1;
        while(a<=10 || a==0){
            System.out.println("While dato: "+a);
            //acumulador
            a++; //a=a+1;
        }
        //Do while 
        int b=1;
        do{
            System.out.println("Do while Dato:"+b);
            b++;//acumulador
        }while(b<=10);
        
    }
}
