import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = sc.nextInt();

        int arr[] = new int[number];
        int j = 0;
        while(number!=0){
            arr[j] = number % 10;
            j++;
            number = number/10;
        }
        
        for(int i =0;i<j;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int fr[] = new int[arr.length];
        int visited = -1;

        for(int i =0;i<j;i++){
            int cnt = 1;
            for(int k=i+1;k<j;k++){
                if(arr[i] == arr[k]){
                    cnt++;
                }
            }

            if(cnt>0){
                System.out.println(arr[i] + " --> " + cnt);
            }
        }
    }
}
