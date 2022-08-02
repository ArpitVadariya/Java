import java.util.Random;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quick(int arr[], int low, int high){
        if(low < high){
            int pidx = partition(arr, low, high);
            System.out.println("pivot index found : " + pidx);
            // to sort first half
            System.out.println("now first part before of pivot will sort");
            quick(arr, low, pidx -1);
            // to sort second half
            System.out.println("now second part after of pivot will sort");
            quick(arr, pidx+1, high);
            System.out.println();
            System.out.println("both halfs are sorted");
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        System.out.println("pivot found : " + pivot);
        int i = low-1;
        System.out.println("temp pidx : " + i);
        System.out.println("now loop travel in array");
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                System.out.println("element is less than pivot " + arr[j] + " is element");
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                System.out.println();
            }
        }
        System.out.print("element is greater than pivot ");
        i++;
        System.out.println(arr[i] + " is element");
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int size  = rd.nextInt(15)+5;
        System.out.println("array size = " + size);
        int arr[] = new int[size];
        printArray(arr);
        System.out.println("Value assigned");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
        quick(arr, 0, size-1);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
        System.out.println();
        System.out.println("------------------------");
    }
}