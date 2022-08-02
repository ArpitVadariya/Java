import java.util.Random;

public class SelectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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
        selection(arr);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
        System.out.println();
        System.out.println("------------------------");
    }
}
