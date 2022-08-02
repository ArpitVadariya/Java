// Write a java program to perform transpose of a matrix.

import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("rows = ");
        int rows = sc.nextInt();
        System.out.print("columns = ");
        int cols = sc.nextInt();
        int matrix [][] = new int[rows][cols];
        
        // input
        System.out.println("Enter numbers");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // real matrix
        System.out.println("real matrix");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("transpose matrix");
        int transpose[][] = new int[cols][rows];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
