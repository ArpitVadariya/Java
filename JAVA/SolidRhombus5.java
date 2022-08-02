        //             *  *  *  *  * 

        //          *  *  *  *  *    

        //       *  *  *  *  *       

        //    *  *  *  *  * 

        // *  *  *  *  *

public class SolidRhombus5 {
    public static void main(String args[]){
        int n=5;

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop --> space print
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            // inner loop --> star print
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
            System.out.println();
        }
    }
}