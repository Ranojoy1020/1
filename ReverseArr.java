import java.util.Scanner;

public class ReverseArr {

    public static void reverseSwap(int array[]){

        int temp = 0;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Reversed Array : ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void reverse(int array[]){

        int revArr[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            revArr[i] = array[array.length - i - 1];
        }

        System.out.println("Reversed Array : ");

        for (int i = 0; i < revArr.length; i++) {
            System.out.println(revArr[i]);
        }
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

        reverseSwap(arr);
        System.out.println();
        reverse(arr);

        input.close();
    }
}
