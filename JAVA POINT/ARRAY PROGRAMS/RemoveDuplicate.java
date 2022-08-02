import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 11, 3, 44, 22, 44, 5, 22, 3, 44, 11, 1, 7, 10, 7, 8, 9, 12, 13, 15};
        System.out.print("Array Elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        ArrayList<Integer> duplicate = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                if(!duplicate.contains(arr[j])){
                    duplicate.add(arr[j]);
                }  
            }  
        } 
        System.out.println();
    }
}