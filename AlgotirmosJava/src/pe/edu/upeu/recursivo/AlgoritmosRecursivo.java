/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.recursivo;

import pe.edu.upeu.subprogramas.LeerTeclado;

/**
 *
 * @author Laboratorio 7
 */
public class AlgoritmosRecursivo {    
    public int factorialRecur(int n){
        if(n>1){
            return n*factorialRecur(n-1);
        }else{
        return 1;
        }
    } 
    
    public int fibonaci(int num){
        if(num<0){
        return -1;
        } else if(num==0){
        return 0;
        }else if(num==1){
        return 1;
        }else{
        return fibonaci(num-1)+fibonaci(num-2);
        }                
    }    
    public static void main(String[] args) {
    AlgoritmosRecursivo ar;
    ar=new AlgoritmosRecursivo();   
    LeerTeclado lt=new LeerTeclado();
    //int num=lt.leer(0, "Ingrese el Factorial de un numero X:");
    //System.out.println("Factorial de "+num+":"+ar.factorialRecur(num));
    int num=lt.leer(0, "Ingrese el fibonaci de X numero:");
    System.out.println("El numero Fibonaci de "+num+" es:"+ar.fibonaci(num));
    
    }    
}
