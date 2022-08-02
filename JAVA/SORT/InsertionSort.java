import java.util.Random;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
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
        insertion(arr);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
        System.out.println();
        System.out.println("------------------------");
    }
}
