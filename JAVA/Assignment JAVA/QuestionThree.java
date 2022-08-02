// Write a java program to count the total number of data in each row and count the total number of data in each column
import java.util.*;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column for matrix1 : ");
        System.out.print("rows = ");
        int row = sc.nextInt();
        System.out.print("columns = ");
        int column = sc.nextInt();
        int matrix [][] = new int[row][column];

        // input --> matrix1
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

        int total = 0;
        for(int i=0; i<row; i++) {
            total = 0;
            int temprow = i + 1;
            for(int j=0; j<column; j++) {
                total = total + matrix[i][j];
            }
            System.out.println("Sum of row " + temprow + " : " + total);
        }

        for(int j=0; j<column; j++) {
            total = 0;
            int tempcolumn = j + 1;
            for(int i=0; i<row; i++) {
                total = total + matrix[i][j];
            }
            System.out.println("Sum of column " + tempcolumn + " : " + total);
        }

    }
}