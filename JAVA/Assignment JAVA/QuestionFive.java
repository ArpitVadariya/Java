// Write a java program to print adjacent number of given data from matrix.
import java.util.*;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column for matrix1 : ");
        System.out.print("rows = ");
        int row = sc.nextInt();
        System.out.print("columns = ");
        int column = sc.nextInt();
        int matrix [][] = new int[row][column];

        // input --> matrix
        System.out.println("Enter " + row*column +" numbers");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix :");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter an element of the matrix : ");
        int element = sc.nextInt();
        // int adjacent[] = new int[4];
        int temprow1 = 0;
        int temprow2 = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if(element == matrix[i][j]){
                    if(j == column-1){
                        temprow1 = matrix[i][j-1];
                    }
                    else if(j == 0){
                        temprow1 = matrix[i][j+1];
                    }
                    else{
                        temprow1 = matrix[i][j-1];
                        temprow2 = matrix[i][j+1];
                    }
                }
            }
        }
        int tempcolumn1 = 0;
        int tempcolumn2 = 0;
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
                if(element == matrix[i][j]){
                    if(i == 0){
                        tempcolumn1 = matrix[i+1][j];
                    }
                    else if(i == row-1){
                        tempcolumn1 = matrix[i-1][j];
                    }
                    else{
                        tempcolumn1 = matrix[i-1][j];
                        tempcolumn2 = matrix[i+1][j];
                    }
                }
            }
        }
        System.out.println("Adjacent elements are : ");
        System.out.print("Row elements are :- ");
        if(temprow2 != 0){
            System.out.print(temprow1 + " ");
            System.out.print(temprow2 + " ");
        }
        else{
            System.out.print(temprow1 + " ");
        }
        System.out.println();
        System.out.print("Column elements are :- ");
        if(tempcolumn2 != 0){
            System.out.print(tempcolumn1 + " ");
            System.out.print(tempcolumn2 + " ");
        }
        else{
            System.out.print(tempcolumn1 + " ");
        }

    }
}