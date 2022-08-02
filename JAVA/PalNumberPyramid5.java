//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
public class PalNumberPyramid5 {
    public static void main(String args[]){
        int n=5;

        // outer loop
        for(int i=1;i<=n;i++){
            // space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // 1st part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            // 2nd part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}