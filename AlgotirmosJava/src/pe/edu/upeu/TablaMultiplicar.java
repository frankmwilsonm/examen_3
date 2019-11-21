/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;
import java.util.Scanner;
public class TablaMultiplicar {
   static Scanner cs=new Scanner(System.in);    
    public static void tMultiplicar(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("\n");
        }    
    }    
    public static void determinarCantidadTipoNumeros(){
        System.out.println("Defina la Cantidad de numeros a Ingresar");
        int N=cs.nextInt();
        int initnum=1;
        int numMenCero=0, numMayCero=0;
        while (initnum<=N) {        
            System.out.println("Ingrese el numero de la posicion "+initnum);
            int numero=cs.nextInt();
            if(numero<=0){
            numMenCero++;
            }else{numMayCero++;}
            initnum++;
        }
        System.out.println("Cant. de Numeros Menores o Igualesque cero:"+numMenCero);
        System.out.println("Cant. de Numeros Mayores a Cero:"+numMayCero);
    }
    
    public static void main(String[] args) {
        int opcion=0;
        do{
            switch(opcion){
            case 1:{tMultiplicar();}break;
            case 2:{determinarCantidadTipoNumeros();}break;
            default:{System.out.println("No existe la opcion eligida!!");}
            }
            System.out.println("Seleccion el algoritmo que desea probar:");
            opcion=cs.nextInt();
        }while(opcion!=0);
    }
  
}
