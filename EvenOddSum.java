import java.util.Scanner;

public class EvenOddSum {

    public static int evenSum(int array[]){
        
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }

        return sum;
    }

    public static int oddSum(int array[]){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.print("Enter the size of array : ");
        
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The array is : ");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("Sum of Even Nos. in array : " + evenSum(arr));
        System.out.println("Sum of Odd Nos. in array : " + oddSum(arr));

        input.close();
    }
    }

