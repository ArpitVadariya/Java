// 7 10 15 19 1
// 7 10
// 10 15
// 15 19
// 19 -1
// 1 -1

// 8 5 9 1
// 8 9
// 5 9
// 9 -1
// 1 -1

// import java.util.*;

public class HA {
    public static void main(String[] args) {
        // Random rd = new Random();
        // int arr[] = {8, 10, 9, 1};
        int arr[] = {7, 10, 15, 19, 1};
        int max;
        for(int i=0;i<arr.length;i++){
            max = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " --> " + max);
        }
    }
}