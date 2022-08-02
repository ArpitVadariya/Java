// Write a java program to perform matrix multiplication.

import java.util.*;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column for matrix1 : ");
        System.out.print("rows = ");
        int row1 = sc.nextInt();
        System.out.print("columns = ");
        int column1 = sc.nextInt();
        int matrix1 [][] = new int[row1][column1];

        // input --> matrix1
        System.out.println("Enter " + row1*column1 +" numbers");
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Enter number of rows and column for matrix2 : ");
        System.out.print("rows = ");
        int row2 = sc.nextInt();
        System.out.print("columns = ");
        int column2 = sc.nextInt();
        int matrix2 [][] = new int[row2][column2];

        // input --> matrix2
        System.out.println("Enter " + row2*column2 +" numbers");
        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        // output --> matrix1
        System.out.println("matrix 1 :");
        for(int i=0; i<row1; i++) {
            for(int j=0; j<column1; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        // output --> matrix2
        System.out.println("matrix 2 :");
        for(int i=0; i<row2; i++) {
            for(int j=0; j<column2; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        if(column1 == row2){

            int matrix4[][] = new int [row1][column2];
            System.out.println("multiplication of matrix1 and matrix2");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column2;j++){
                    for(int k=0;k<column1;k++){
                        matrix4[i][j] = matrix4[i][j] + (matrix1[i][k] * matrix2[k][j]);
                    }
                }
            }

            for(int i=0;i<row1;i++){
                for(int j=0;j<column2;j++){
                    System.out.print(matrix4[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("can not multiply");
        }
    }
}