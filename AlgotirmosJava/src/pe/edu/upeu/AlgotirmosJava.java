/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.util.Scanner;

public class AlgotirmosJava {
    //Creando un Objeto
    static Scanner cs=new Scanner(System.in);   
    
    //Ejemplo 01
    //Creando un Metodo denominado cantidadPagoLapices
    public static void cantidadPagoLapices(){
        //definiendo tipo de Variables
        int xCantLapices;
        double pago;
        //Leer Datos desde el Teclado
        System.out.println("Ingrese la Cantidad de Lapices a comprar:");
        xCantLapices=cs.nextInt();
        //Proceso
        if(xCantLapices>=1000){
            pago=xCantLapices*0.85;
        }else{
            pago=xCantLapices*0.90;
        } 
        //resultado
        System.out.println("El Monto a pagar es :"+pago +" Soles");    
    }
    //Ejemplo 02 del ejemplo 3.9 de la Diapositiva 03
    //Creando un Metodo denominado cobroPorLlamada    
    public static void cobroPorLlamada(){
        // Definir Variables segun tipo de datos
        int ti=0;//Inicializando Valores
        String di,tu;
        double st,imp, tp;
        //Leer Valores desde el Teclado
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Minutos:");
        ti=leer.nextInt();        
        System.out.println("Ingrese el día de la llamada:");
        di=leer.next();        
        System.out.println("Ingrese el Turno de llamada:");
        tu=leer.next();
        //Proceso
        if(ti<=5){
            st=ti*1;
        }else if(ti<=8){
            st=(ti-5)*0.80+5;
        }else if(ti<=10){
            st=(ti-8)*0.70+7.4;
        }else{
            st=(ti-10)*0.50+8.8;
        }
        
        if(di.equals("Domingo")){//equals es para comparar cadena
            imp=st*0.03;
        }else{
            if(tu.equals("Matutino")){
                imp=st*0.15;    
            }else{
                imp=st*0.10;
            }
        }
        tp=st+imp;
        //Imprimir datos de Salida (Resultado)
        System.out.println("El subtotal de la llamada es:"+st);
        System.out.println("El Impuesto a pagar es:"+imp);
        System.out.println("Total a pagar es:"+tp);
        System.out.println("La llamada se realizó en el día: "+di);
        System.out.println("La llamada fue en Turno: "+tu);
                 
   }
    
    //Ejemplo 02-->3.20 de la Diapositiva 03
    public static void fabricaPantalonesTipoModelo(){
    //declarando variables
    double precioFinalVenta=0, gananciaNPantalones=0, costoTela=0;
    String modeloPantalon="";
    int cantidadPantalones=0;
    //Leer valores desde el Teclado
    System.out.println("Ingrese Cantidad de Pantalones:");
    cantidadPantalones=cs.nextInt();
    System.out.println("Ingrese el Costo de la Tela x Metro:");
    costoTela=cs.nextDouble();
    System.out.println("Ingrese el Modelo de Pantalon:");
    modeloPantalon=cs.next();
    //Proceso
    switch(modeloPantalon){
        case "ModeloA":{
            precioFinalVenta=((costoTela*1.50)+((costoTela*1.50)*0.80));
            gananciaNPantalones=((costoTela*1.50)*0.80)*cantidadPantalones;            
        }break;
        case "ModeloB":{ 
            precioFinalVenta=((costoTela*1.80)+((costoTela*1.80)*0.95));
            gananciaNPantalones=((costoTela*1.80)*0.95)*cantidadPantalones;           
        }break;
        default:System.out.println("Modelo no valida");
    }
    //Mostrando Resultados
        System.out.println("El valor de Venta es:"+precioFinalVenta);
        System.out.println("La ganancia por N Pantalones es:"+gananciaNPantalones);
    
    }
    
    public static void calcularAreaFigura(){
        System.out.println("Elija el area de que figura desea Calcular");
        System.out.println("T-->Triangulo\nC-->cuadrado\nR-->Rombo");
        String figura=cs.nextLine();
        
        do{
        switch(figura){
        case "T":{
                System.out.println("Ingrese la base del Triangulo:");
                int base=cs.nextInt();
                System.out.println("Ingrese la altura del Triangulo:");
                int h=cs.nextInt();
                int area=(base*h)/2;
                System.out.println("El area del triangulo es:"+area);
                double resultado=Math.pow(5, 2);
                System.out.println("Potencia:"+resultado);
                }break;
        case "C":{ System.out.println("Favor Implementar el "
                + " Algoritmo en Casa para el Cuadrado"); }break;
        case "R":{ System.out.println("Favor Implementar el "
                + " Algoritmo en Casa para el Rombo"); }break;                
        default:{System.out.println("la opcion no existe");}
        } 
        System.out.println("Elija el area de que figura desea Calcular");
        System.out.println("T-->Triangulo\nC-->cuadrado\nR-->Rombo");        
        figura=cs.nextLine();
        }while(!figura.equals("X"));
        

    }
    
    public static void tablaMultiplicar1a9(){
    //Tabla de Multiplicar con el While
    int tablaInit=1;//Acumulador
    int tablaInit2=1;    //Acumulador
    while(tablaInit<=9){
        while (tablaInit2<=9) {            
            System.out.println(tablaInit+"x"+tablaInit2+"="+tablaInit*tablaInit2);
            tablaInit2++;//Contador
        }
        System.out.println("\n");
        tablaInit++;//Contador
        tablaInit2=1;
    }    
    }
    
    public static void main(String[] args) {               
        //Ejemplo de Estructura Condicional Multiple
        //declarando variable nombreAlgoritmo
        String nombreAlgoritmo;
        //Leendo el nombre de algoritmo
        System.out.println("Seleccione el Algoritmo que desea Probar \n A1-->Cantidad de Pago x Lapices"
                + "\n A2-->Fabrica de Pantalones \n A3-->Cobro or Llamada  \nEliga uno de ellos:");
        nombreAlgoritmo=cs.nextLine();
        //Usando Estructura Condicional Multiple       
        switch(nombreAlgoritmo){
            case "A1":{ cantidadPagoLapices(); }break;
            case "A2":{ fabricaPantalonesTipoModelo(); }break;
            case "A3":{ cobroPorLlamada(); }break;
            case "A4":{ calcularAreaFigura(); }break;            
            default:{ System.out.println("Opcion no valida"); }
        }
        
        
    }
    
}
