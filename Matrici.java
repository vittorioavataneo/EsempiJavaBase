public class Matrici{
    public static void main(String args[]){
        int x[][] = new int [5][10];
        int y[][] = new int [5][];
                                  
                                  //primo array (righe)
        for(int i=0; i<x.length; i++){
            for(int j=0; j < x[0].length; j++){
                x[i][j]=(j+1)*(int)Math.pow(10, i); // ad ogni ripietizione compila l'array considerando riga e colonne
            }
        }
        printMatrix(x);

        /*for(int i=0; i<x.length;i++){
            for(int j=0; j<x[0].length; j++){
                System.out.print(x[i][j] + " ");
            }
        }
        */
        for(int i=0; i<y.length;i++){
            y[i]= new int [i+1];   // cambia il  numer di colonne ad ogni riga (effett scala)
        }
        
        printMatrix(y);

        y[2]= new int[]{3,12,22}; //cambio riga 3 a mio piacimento

        printMatrix(y);

    }

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}