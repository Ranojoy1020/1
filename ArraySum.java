/**
 * * Sum of all elements in array.
 */

import java.util.Scanner;

public class ArraySum {

    public static int sumArray(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
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


        System.out.println(sumArray(arr));

        input.close();
    }


    
}