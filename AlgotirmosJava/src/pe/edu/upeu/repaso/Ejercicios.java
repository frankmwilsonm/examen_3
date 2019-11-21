package pe.edu.upeu.repaso;

public class Ejercicios {
    //Salario
    public static void ejercicio4_1(){        
        double salarioActual=1500;
        int incAnho=1;
        while(incAnho<=6){
        if(incAnho==1){
            System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);            
        }else{
            salarioActual=salarioActual+(salarioActual*0.10);
            System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);                
        }
        incAnho++;
        }        
    }
    public static void ejercicio4_1f2(){        
        double salarioActual=1500;        
        for (int incAnho = 1; incAnho <=6; incAnho++) {
        if(incAnho==1){
            System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);            
        }else{
            salarioActual=salarioActual+(salarioActual*0.10);
            System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);                
        }            
        }       
    }
    public static void ejercicio4_1f3(){        
        double salarioActual=2000;        
        System.out.println("El salario del "
                    + "Profesor en el año 1  es:"+salarioActual);         
        for (int incAnho = 2; incAnho <=6; incAnho++) {
            if(incAnho%2==0){
                    salarioActual=salarioActual+(salarioActual*0.10);
                    System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);
            }else{
                    salarioActual=salarioActual+(salarioActual*0.15);
                    System.out.println("El salario del "
                    + "Profesor en el año "+incAnho+"  es:"+salarioActual);            
            }
        }       
    }
    public static void ejercicio4_1f4(){        
        double salarioActual=10000;
        double salarioReal;        
        for (int incAnho = 0; incAnho <=40; incAnho++) {                        
            salarioReal=salarioActual*Math.pow(1.1, incAnho);
            System.out.println("Año "+incAnho+ "es :"+salarioReal);            
        }       
    }
    
    public static void main(String[] args) {
        ejercicio4_1();
        System.out.println("");
        ejercicio4_1f2();
        System.out.println("");
        ejercicio4_1f3();
        System.out.println("");
        ejercicio4_1f4();//:411447.77789250994
       
    }
    
}
