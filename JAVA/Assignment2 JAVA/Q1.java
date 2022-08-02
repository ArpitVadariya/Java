// Write a program to accept number as an integer as a command line argument and display following pattern
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=number-1;i>=1;i--){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}