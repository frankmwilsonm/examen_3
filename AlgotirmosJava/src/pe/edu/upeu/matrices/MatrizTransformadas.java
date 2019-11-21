
package pe.edu.upeu.matrices;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class MatrizTransformadas {
    
   static Scanner cs=new Scanner(System.in);
   
    public static void imprimirMatriz(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
               if(j==0 && i!=0){System.out.println("");}
                System.out.print("\t"+M[i][j]+"|");
            }
        }
        System.out.println("");
    }
    
    public static int[][] transformada01(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               
            }
        }        
        return M;
    }
    
    public static int[][] transformada02(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;                  
            }
        }        
        return M;
        }
    
    public static int[][] transformada03(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }
            }
        }        
        return M;
        }
    
    public static int[][] transformada04(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {                
                if((i+j)%2==0){
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      
                }else{
                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      
                }                
            }
        }        
        return M;
        }
    
    public static int[][] transformada06(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {                
                M[i][j]=numInit;
                numInit++;
            }
        }        
        return M;
        }
    
    public static int[][] transformada15(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=0+j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] transformada16(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            for (int i = dim-1; i >=(dim-1)-j; i--) {
                System.out.println("M["+i+"]["+j+"]="+numInit);
                M[i][j]=numInit;
                numInit++;
            }        
        }
        return M;
        }
    public static int[][] transformada21(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = 0; j <dim; j++){
            if(j%2==0){
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = dim-1; i >=0; i--) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    
    public static int[][] transformada24(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();//dim=5 numInit=0
        for(int j = dim-1; j>=0; j--){
            if(j%2==0){
            for (int i = dim-1; i >=0; i--) { //              
                M[i][j]=numInit;
                numInit++; }            
            }else{
            for (int i = 0; i <dim; i++) {                
                M[i][j]=numInit;
                numInit++;}            
            }
        }
        return M;
        }
    
    public static int[][] transformCaracol30(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
    public static int[][] transformCaracol34(){
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim=cs.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=cs.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
        public static int[][] transformCaracolfrank() {
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim = cs.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit = cs.nextInt();//dim=5 numInit=0
        for (int c = 0; c < dim / 2; c++) {
            System.out.println("\n");
            
            System.out.println("##### Lado derecho: ");
            for (int ld = c; ld < dim - 1 - c; ld++) { //Lado derecho
                System.out.println("Orizontal "+ld+" // Vertical "+dim+"-1"+"-"+c);
//                System.out.println("ld=" + ld + " dim-1= " + dim + " c= " + c);
                System.out.println("N++: "+numInit);
                M[ld][dim - 1 - c] = numInit;
                numInit++;
               
            }
            System.out.println("\n");
            
            System.out.println("##### Lado inferior: ");
            for (int li = dim - 1 - c; li > c; li--) { //Lado inferior
                System.out.println("Orizontal "+dim+"-1-"+c+" // Vertical "+li);
//                System.out.println("li " + li + " dim " + dim + " c=" + c);
                System.out.println("N++: "+numInit);
                
                M[dim - 1 - c][li] = numInit;
                numInit++;
                
            }
            System.out.println("\n");
            
            System.out.println("##### Lado izquierdo: ");
            for (int liz = dim - 1 - c; liz > c; liz--) { //Lado izquierdo
                System.out.println("Orizontal "+liz+" // Vertical "+c);
                System.out.println("N++: "+numInit);
                M[liz][c] = numInit;
                numInit++;
                System.out.println(numInit);
            }
            System.out.println("\n");
            
            System.out.println("##### Lado superior: ");
            for (int ls = c; ls < dim - 1 - c; ls++) { //Lado superior
                System.out.println("Orizontal "+c+" // Vertical "+ls);
                System.out.println("N++: "+numInit);
                M[c][ls] = numInit;
                numInit++;
                
            }
        }
        if (dim % 2 != 0) {
            M[dim / 2][dim / 2] = numInit;
        }
        return M;
    }

        
    public static void main(String[] args) {
//        imprimirMatriz(transformada01());
//        imprimirMatriz(transformada02());
//        imprimirMatriz(transformada03());
//        imprimirMatriz(transformada04());
          imprimirMatriz(transformada06());
        //imprimirMatriz(transformada24());
        //imprimirMatriz(transformCaracol30());
    }
}


