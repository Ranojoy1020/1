import java.util.Scanner;

public class DiagSum {

    public static void addMainDiag(int matrix[][]) {
        int sum = 0;

        /*
          ! Don't do it this way. [The long way]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == j) sum = sum + matrix[i][j];
            }
        }
*/

        for (int i = 0; i < matrix.length; i++) sum = sum + matrix[i][i];
        
        System.out.println("\nSum of elements in main diagonal " + sum);

    }
    
    public static void addAntiDiag(int matrix[][]) {
        int sum = 0;

        for (int i = 0 ; i < matrix.length ; i++) {
                sum = sum + matrix[i][matrix.length - i - 1];
        }

        System.out.println("\nSum of elements in Antidiagonal " + sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rows of matrices : ");
        int rows = input.nextInt();

        System.out.print("Enter the columns of matrices : ");
        int columns = input.nextInt();

        int mat[][] = new int[rows][columns];

        System.out.println("Enter the elements of matrix : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix is : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        addMainDiag(mat);
        addAntiDiag(mat);

        input.close();
    }
}
