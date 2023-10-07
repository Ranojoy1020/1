import java.util.Scanner;

public class Transpose {

    public static void transposeMatrix(int matrix[][]){
        int transposedMatrix[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("\nTranspose of matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of matrices : ");
        int rows = input.nextInt();
        int columns = rows;
        
        int mat1[][] = new int[rows][columns];
        
        System.out.println("Enter the elements of matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix is : ");

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        transposeMatrix(mat1);

        input.close();
    }
}
