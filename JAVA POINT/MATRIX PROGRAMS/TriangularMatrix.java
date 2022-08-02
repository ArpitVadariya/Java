import java.util.*;

public class TriangularMatrix {
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

        // output --> upper triangular
        System.out.println("UPPER TRIANGULAR MATRIX");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i<=j){
                    System.out.print(matrix[i][j] + "\t");
                }
                else{
                    System.out.print("0" + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        // output --> lower triangular
        System.out.println("LOWER TRIANGULAR MATRIX");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i>=j){
                    System.out.print(matrix[i][j] + "\t");
                }
                else{
                    System.out.print("0" + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}
