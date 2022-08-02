import java.util.*;

public class IdentityMatrix {
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
                matrix[i][j] = rd.nextInt(2);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean flag = true;

        if(row != column){
            System.out.println("Matrix should be Square Matrix");
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    if(i == j && matrix[i][j] != 1){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("matrix is identity matrix");
            }
            else{
                System.out.println("matrix is not identity matrix");
            }
        }
    }
}
