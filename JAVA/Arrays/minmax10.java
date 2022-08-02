import java.util.*;

public class minmax10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.println("Enter number one by one : ");
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.print(" number = ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        System.out.print("minimum value is : ");
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);

        System.out.print("maximum value is : ");
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}