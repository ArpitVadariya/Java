import java.util.*;

public class SumRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter number of rows and column for matrix : ");
        System.out.print("rows = ");
        int row = sc.nextInt();
        System.out.print("columns = ");
        int column = sc.nextInt();
        int matrix [][] = new int[row][column];

        // input --> matrix1
        // System.out.println("Enter " + row1*column1 +" numbers");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = rd.nextInt(10)+1;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sumrow = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sumrow += matrix[i][j];
            }
            System.out.println("sum of row " + (i+1) + " is " + sumrow);
            sumrow = 0;
        }
        int sumcolumn = 0;
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
                sumcolumn += matrix[i][j];
            }
            System.out.println("sum of column " + (j+1) + " is " + sumcolumn);
            sumcolumn = 0;
        }
        
    }
}
