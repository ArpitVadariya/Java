import java.util.*;

public class TransposeMatrix {
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
        System.out.println();
        System.out.println();
        System.out.println("Transpose");
        int transpose [][] = new int[column][row];
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                transpose[i][j] = matrix[i][j];
            }
        }
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        
    }
}
