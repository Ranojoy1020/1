import java.util.Scanner;

public class MultiplyMatrices {

    public static void Multiply(int matrix1[][], int matrix2[][]){
        int result[][] = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        System.out.println("\nMultiplication of matrices : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the rows of matrices : ");
        int rows = input.nextInt();

        System.out.print("Enter the columns of matrices : ");
        int columns = input.nextInt();
        
        int mat1[][] = new int[rows][columns];
        int mat2[][] = new int[rows][columns];
        
        System.out.println("Enter the elements of FIRST matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat1[i][j] = input.nextInt();
            }
        }


        System.out.println("Enter the elements of SECOND matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat2[i][j] = input.nextInt();
            }
        }

        System.out.println("The FIRST matrix is : ");

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The SECOND matrix is : ");

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        Multiply(mat1, mat2);

        input.close();
    }
}
