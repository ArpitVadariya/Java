import java.util.*;

public class transposematrix11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("rows = ");
        int rows = sc.nextInt();
        System.out.print("columns = ");
        int cols = sc.nextInt();
        int numbers [][] = new int[rows][cols];
        
        // input
        System.out.println("Enter numbers");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        // real matrix
        System.out.println("real matrix");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("transpose");
        for(int j=0; j<cols; j++) {
            for(int i=0; i<rows; i++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}