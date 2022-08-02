import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ASCENDING USING BUBBLE SORT");
        System.out.print("Enter size of  array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                // here condition is greater than
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Ascending array : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}