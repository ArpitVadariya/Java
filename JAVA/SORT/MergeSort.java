import java.util.Random;

public class MergeSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void divide(int arr[], int left, int right){
        if(left >= right){
            return;
        }

        int mid = left + (right - left)/2;
        System.out.println("mid found " + mid);
        // to divide first half
        System.out.println("now first half will divide");
        divide(arr, left, mid);
        // to divide second half
        System.out.println("now second half will divide");
        divide(arr, mid+1, right);
        // to conquer divided parts
        System.out.println("it's time to conquer");
        conquer(arr, left, mid, right);
        System.out.println("both parts conquered");
    }
    public static void conquer(int arr[], int left, int mid, int right){
        int merged[] = new int[right - left + 1];
        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<= mid && idx2<= right){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= right){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=left; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args) {
        Random rd = new Random();
        int size  = rd.nextInt(15)+5;
        System.out.println("array size = " + size);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = rd.nextInt(100)+1;
        }
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
        divide(arr, 0, size-1);
        System.out.println();
        System.out.println("After Sorting");
        printArray(arr);
        System.out.println();
        System.out.println("------------------------");
    }
}