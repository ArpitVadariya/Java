import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 11, 3, 44, 22, 44, 5, 22, 3, 44, 11, 1, 7, 10, 7, 8, 9, 12, 13, 15}; 
        System.out.println("Original");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        } 
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j] + " ");  
            }  
        } 
    }
}

