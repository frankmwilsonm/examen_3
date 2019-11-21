
package pe.edu.upeu.matrices;

import java.util.Scanner;

public class Matrices {
    public static int[][] rellenarMatriz(int x, int y){
        Scanner cs=new Scanner(System.in);
        int[][] M=new int[x][y];
        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.println("Ingrese su valor de M["+i+"]["+j+"]=");
                M[i][j]=cs.nextInt();
            }
        }        
        return M;
    }

    public static int[][] suma2MatricesSimetricos(int[][] A, int[][] B){
        int [][] NM=new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                NM[i][j]=A[i][j]+B[i][j];
            }
        }
        return NM;
    }
    
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {       
        //imprimirMatriz(rellenarMatriz(2, 2));
        imprimirMatriz(suma2MatricesSimetricos(rellenarMatriz(2, 2), 
                rellenarMatriz(2, 2)));
        
        int[][] M={{2,2,2,2},
                   {4,4,4,4}, 
                   {5,5,5,5}, 
                   {7,7,7,7}, 
                   {6,6,6,6}, 
                   {3,3,3,3} 
                  };
        
        int[][] Mx=new int[6][4];
        
        int[][] MY;
        
        //Tamaño fila: M.length, Tamaño de la Columna:M[0].length
        int sumNum=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if(M[i][j]%3==0){
                sumNum=sumNum+M[i][j];
                }
            }
        }
        System.out.println("Suma:"+sumNum);
    }
}
