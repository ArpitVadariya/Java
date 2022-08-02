import java.util.*;

public class sorted10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.println("Enter number one by one");
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.print(" number = ");
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
                break;
            }
        }

        if(isAscending){
            System.out.println("Array is sorted in ascending order.");
        }
        else{
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}