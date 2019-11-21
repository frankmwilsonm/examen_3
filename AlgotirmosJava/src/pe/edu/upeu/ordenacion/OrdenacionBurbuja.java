
package pe.edu.upeu.ordenacion;



public class OrdenacionBurbuja {    
    public static void main(String[] args) {
        int[] vector={9,2,8,3,10,6};
        int temp;
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length-i; j++) {
                if(vector[j]>vector[j+1]){
                temp=vector[j];
                vector[j]=vector[j+1];
                vector[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i]+"|");    
        }                
    }
}
