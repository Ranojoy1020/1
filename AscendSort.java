import java.util.Scanner;

public class AscendSort {

    public static void AscendingSort(int array[]) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println("Sorted Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
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
        
        AscendingSort(arr);

        input.close();
    }
}
