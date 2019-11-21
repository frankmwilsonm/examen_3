package pe.edu.upeu.matrices;
import static pe.edu.upeu.matrices.MatrizTransformadas.cs;
import static pe.edu.upeu.matrices.MatrizTransformadas.imprimirMatriz;

public class Frank_Examen3 {

    public static int[][] transformCaracolfrank29() {
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim = cs.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit = cs.nextInt();//dim=5 numInit=0
        for (int c = 0; c < dim / 2; c++) {
 
            System.out.println("\n");
            
            System.out.println("##### Lado superior: ");
            for (int ls = c; ls < dim - 1 - c; ls++) { //Lado superior
                System.out.println("Orizontal " + c + " // Vertical " + ls);
                System.out.println("N++: " + numInit);
                M[c][ls] = numInit;
                numInit++;
            }

            System.out.println("##### Lado derecho: ");
            for (int ld = c; ld < dim - 1 - c; ld++) { //Lado derecho
                System.out.println("Orizontal " + ld + " // Vertical " + dim + "-1" + "-" + c);
//                System.out.println("ld=" + ld + " dim-1= " + dim + " c= " + c);
                System.out.println("N++: " + numInit);
                M[ld][dim - 1 - c] = numInit;
                numInit++;

            }
            System.out.println("\n");

            System.out.println("##### Lado inferior: ");
            for (int li = dim - 1 - c; li > c; li--) { //Lado inferior
                System.out.println("Orizontal " + dim + "-1-" + c + " // Vertical " + li);
//                System.out.println("li " + li + " dim " + dim + " c=" + c);
                System.out.println("N++: " + numInit);

                M[dim - 1 - c][li] = numInit;
                numInit++;

            }
            System.out.println("\n");

            System.out.println("##### Lado izquierdo: ");
            for (int liz = dim - 1 - c; liz > c; liz--) { //Lado izquierdo
                System.out.println("Orizontal " + liz + " // Vertical " + c);
                System.out.println("N++: " + numInit);
                M[liz][c] = numInit;
                numInit++;
                System.out.println(numInit);
            }
            System.out.println("\n");

        }
        if (dim % 2 != 0) {
            M[dim / 2][dim / 2] = numInit;
        }
        return M;
    }
    
        public static int[][] transformCaracolfrank14(){
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=cs.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=cs.nextInt();


        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("Fila[j]:"+j+" // Columna[i]:"+i+"\n N++ = "+numInit);
                M[j][i]=numInit;
                numInit++;
                System.out.println("\n");
            }
        }
        return M;
        }

    public static void main(String[] args) {
        
        imprimirMatriz(transformCaracolfrank29());
//        imprimirMatriz(transformCaracolfrank14());
    }
}
