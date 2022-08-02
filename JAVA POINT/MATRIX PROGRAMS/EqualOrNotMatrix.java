import java.util.*;

public class EqualOrNotMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter number of rows and column for matrix1 : ");
        System.out.print("rows = ");
        int row1 = sc.nextInt();
        System.out.print("columns = ");
        int column1 = sc.nextInt();
        int matrix1 [][] = new int[row1][column1];

        // input --> matrix1
        // System.out.println("Enter " + row1*column1 +" numbers");
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                matrix1[i][j] = rd.nextInt(10)+1;
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
        // System.out.println("Enter " + row2*column2 +" numbers");
        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                matrix2[i][j] = rd.nextInt(10)+1;
            }
        }

        // output --> matrix1
        System.out.println("matrix 1 :");
        for(int i=0; i<row1; i++) {
            for(int j=0; j<column1; j++) {
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }

        // output --> matrix2
        System.out.println("matrix 2 :");
        for(int i=0; i<row2; i++) {
            for(int j=0; j<column2; j++) {
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        boolean flag = true;
        if(row1 == row2 && column1 == column2){
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++){
                    if(matrix1[i][j] != matrix2[i][j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("equal");
            }
            else{
                System.out.println("not equal");
            }
        }
        else{
            System.out.println("Matrices are not Equals");
        }
        
    }
}
