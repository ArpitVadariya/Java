import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(100);
        }
        System.out.print("Even Elements : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Elements : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
