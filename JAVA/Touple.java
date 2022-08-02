import java.util.*;

public class Touple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];
        System.out.println("Enter number : ");
        for(int i=0;i<7;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<6;i++){
            if(arr[i-1] == arr[i]){
                if(arr[i] != arr[i+1]){
                    System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1] + " Good Touple");
                }
                else{
                    System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1] + " All Same");
                    continue;
                }
            }
            else if(arr[i] == arr[i+1]){
                System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1] + " Good Touple");
            }
            else if(arr[i-1] == arr[i+1]){
                System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1] + " Good Touple");
            }
            else{
                System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1] + " Bad Touple");
            }
            //  System.out.println(arr[i-1] + "," + arr[i] + "," + arr[i+1]);
        }
    }
}