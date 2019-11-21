
package pe.edu.upeu.repasoinicio;

public class RepasoInicio {
 
    public static void main(String[] args) {
        //tipos de datos
        int num1=5, num2=6;
        num1=1;num1=2;
        System.out.println("Valor de num1:"+num1);        
        double numD1=6.0, numD2=5.0;
        float numAf=6.0f, numBf=6.0f; 
        boolean v=true, f=false;         
        char valor=' ';
        valor='*';
        valor='R';
        String nombre="AA";
               
        //Operadores  Aritmeticos //En java + se usa para concatenar
        System.out.println("Suma es:"+(num1+num2)); //Suma
        System.out.println("Division es:"+(num1/num2)); //Division
        System.out.println("Resta es:"+(num1-num2)); //Resta
        System.out.println("Multiplicacion es:"+(num1*num2)); //Multiplicacion
        System.out.println("Resto es:"+(num1%num2)); //Resto /mod //modulo
        
        //Numeros con decimales
        System.out.println("Suma es:"+(numD1+numD2)); //Suma
        System.out.println("Division es:"+(numD1/numD2)); //Division
        System.out.println("Resta es:"+(numD1-numD2)); //Resta
        System.out.println("Multiplicacion es:"+(numD1*numD2)); //Multiplicacion
        System.out.println("Resto es:"+(numD1%numD2)); //Resto /mod //modulo
        
        //Numeros con decimales flotantes
        System.out.println("Suma es:"+(numAf+numBf)); //Suma
        System.out.println("Division es:"+(numAf/numBf)); //Division
        System.out.println("Resta es:"+(numAf-numBf)); //Resta
        System.out.println("Multiplicacion es:"+(numAf*numBf)); //Multiplicacion
        System.out.println("Resto es:"+(numAf%numBf)); //Resto /mod //modulo
        
        //Potencia 3^3
        System.out.println("3^3="+(Math.pow(3, 3)));
        num1=5; num2=6;
        num1++; //incrementa en una unidad
        num2--; //decremente en una unidad
        System.out.println("Enteros:"+num1 + "---"+num2);
        numD1=6.1; numD2=4.1;
        numD1++;
        numD2--;
        System.out.println("Doubles:"+numD1 + "---"+numD2);
        numAf=6.0f; numBf=4.0f;
        numAf++;
        numBf--;
        System.out.println("Float:"+numAf + "---"+numBf);
        
        //Operadores de asignacion
        num1=5; num2=6; numD1=6.1; numD2=4.1; numAf=6.0f; numBf=4.0f;
        num1+=num2; System.out.println("Suma: "+num1);
        num1-=num2; System.out.println("Resta: "+num1);
        num1*=num2; System.out.println("Multiplicación: "+num1);
        num1/=num2; System.out.println("Division: "+num1);
        num1%=num2; System.out.println("Resto: "+(double)(num1));
        
        //Operadores de Comparacion/Logicos/Estructuras de Control
        //numerico
        if(num1==num2){}  if(num1==num2){}
        if(num1>=num2){}  if(num1<=num2){}
        if(num1>num2){}  if(num1<num2){}
        //no numerico
        if(v==false){}  if(v){} if(v!=false){}  if(!v){} 
        if(valor=='R'){} if(valor!='R'){} 
        if(nombre.equals("David")){} if(!nombre.equals("David")){} 
        //operadores Logicos Y/O     /not (Implicito)
        if(num1==num2 && valor=='*' && nombre.equals("Dario")){ }
        if(num1==num2 || (valor=='*' && nombre.equals("Dario"))){ }
        if(num1==num2 || (valor=='*' && nombre.equals("Dario"))){ }
        //Estructuras de control  Secuenciales/Condicionales/Repetitivas
        //Condicionales Simples
        if(valor=='R'){ }else{ }
        if(valor=='R'){ }else if(valor=='D'){  }else{  }
        if(num1>0){ if(num1%2==0){ }else{ }}else{}
        //condicionales Multiples
        switch(num1){ case 1:{} break; case 2:{}break; default:{ } }
        switch(valor){ case 'R':{} break; case ' ':{}break; default:{ } }
        switch(nombre){ case "dario":{} break; case "A":{}break; default:{ } }
        switch(nombre){ case "dario":{ if(nombre.equals("Juan")){} } break; 
        case "A":{}break; default:{ } }
        //Repetitivas   for/while/do while
        //For
        for (int i = 0; i < 10; i++) {  }
        //While
        while(v){ }  while(v==true || v==false){ }
        while(num1>=1){ num1=0;}  while(num1==0 && num1>0){ }
        while(valor==' '){ }  while(valor!=' ' && num1>0){ }
        while(nombre.equals("Juan")){ }  while(!nombre.equals("Juan") && num1>0){ }
        //do while
        do{
        
        }while(v!=true);
        
        do{
        
        }while(valor==' ' && num1>0 || !nombre.equals("David"));
        
        
        
    }
    
}
