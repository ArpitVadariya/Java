import java.util.*;

public class CopyElementsFromOneToAnotherArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("array 1 Elements");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("array 2 Elements");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}