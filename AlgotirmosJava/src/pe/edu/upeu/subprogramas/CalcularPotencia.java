
package pe.edu.upeu.subprogramas;

public class CalcularPotencia {
    // <double> tipo de retorno de resultado 3 3
    public static double potencia(double x,int n){
        double resultado=1;
        for (int i = 1; i <=Math.abs(n); i++) {
            resultado=resultado*x;
        }
        if(n<0){
        resultado=1/resultado;
        }
        return resultado; //es el Retorno de tipo double
    }
    
    public double potenciaTipoDos(double x,int n){
        double resultado=1;
        for (int i = 1; i <=Math.abs(n); i++) {
            resultado=resultado*x;
        }
        if(n<0){
        resultado=1/resultado;
        }
        return resultado; //es el Retorno de tipo double
    }    
    
    public int factorial(int numero){
        int resultado=1;
        for (int i = 1; i <= numero; i++) {
            resultado=resultado*i;
        }
        return resultado;
    }
    
    public void factorialEntre2Numeros(int valInicial, int valFinal){
        CalcularPotencia cp=new CalcularPotencia();
        for (int i = valInicial; i <= valFinal; i++) {
            System.out.println("El Factorial de "+i+" es:"+cp.factorial(i));
        }
    }    
    public static void main(String[] args) {        
        LeerTeclado lt=new LeerTeclado();
        double base=0;int elebadoa=0;                
        CalcularPotencia cp=new CalcularPotencia();//cp es un Objeto 
        int opcion=0;        
        try {
            opcion=lt.leer(0, "Seleccione el algoritmo que desea probar:");
        } catch (Exception e) {
            System.out.println("Error en el Ingreso de datos"+e.getMessage());
        }
        
        do{ switch(opcion){
                case 1:{ 
                    base=lt.leer(0.0, "Numero Base:");
                    elebadoa=lt.leer(0, "Numero Elebado a:");
                    System.out.println(potencia(base, elebadoa)); } break;
                case 2:{ 
                    base=lt.leer(0.0, "Numero Base:");
                    elebadoa=lt.leer(0, "Numero Elebado a:");                    
                    System.out.println(cp.potenciaTipoDos(base, elebadoa));} break;
                    
                case 3:{                     
                    int numero=lt.leer(0, "Ingrese el factorial del numero que desea calcular:");
                    System.out.println("El Factorial "+numero+" es:" + cp.factorial(numero));                    
                    } break;
                case 4:{
                cp.factorialEntre2Numeros(
                lt.leer(0, "Ingrese Valor Inicial:"), 
                lt.leer(0, "Ingrese Valor Final:"));
                }break;
                default:System.out.println("Opcion no valida");
            }
            opcion=lt.leer(0, "Eligir nuevamente el algoritmo que desea probar:");
        }while(opcion!=0);        
        }
   
}