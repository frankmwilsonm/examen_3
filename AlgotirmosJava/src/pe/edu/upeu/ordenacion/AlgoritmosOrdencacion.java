
package pe.edu.upeu.ordenacion;


public class AlgoritmosOrdencacion {
        
    public static void main(String[] args) {
       //Algoritmo de Ordenacion por insercion directa
        int[] vector={3,4,1,6,8,2}; 
        int temp=0, posicionP=0;
        
      
        for (int i = 1; i < vector.length; i++) {
            temp=vector[i];
            posicionP=i;
            while(posicionP>0 && temp>vector[posicionP-1]){
            vector[posicionP]=vector[posicionP-1];
            posicionP--;
            }
            vector[posicionP]=temp;
        }
        
        
        
        System.out.println("\n");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"|");
        }                
    }
       
}
