import java.util.Random;

public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    // System.out.println(arr[j] + " and  " + arr[j+1] + " will swap");
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int size = rd.nextInt(15) + 5;
        System.out.println("array size = " + size);
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(10);
        }
        System.out.println("Value assigned");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Before Sorting");
        printArray(arr);
        System.out.println();
        bubble(arr);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
        System.out.println();
        System.out.println("------------------------");
    }
}
