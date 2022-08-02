import java.util.*;

public class ThirdLargestElement {
    public static int[] AscendingSortArray(int fr[]){
        for(int i=0;i<fr.length-1;i++){
            for(int j=0;j<fr.length-i-1;j++){
                // here condition is greater than
                if(fr[j] > fr[j+1]){
                    int temp = fr[j];
                    fr[j] = fr[j+1];
                    fr[j+1] = temp;
                }
            }
        }
        return fr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of  array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        AscendingSortArray(arr);
        System.out.println("Third Largest Element : " + arr[size -3]);
        System.out.println("Second Largest Element : " + arr[size -2]);
        System.out.println("Largest Element : " + arr[size -1]);
        System.out.println("smallest Element : " + arr[0]);
        System.out.println("Second smallest Element : " + arr[1]);
        System.out.println("Third smallest Element : " + arr[2]);
    }
}
