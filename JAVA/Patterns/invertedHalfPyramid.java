//             * 

//          *  * 

//       *  *  * 

//    *  *  *  * 

// *  *  *  *  *




public class invertedHalfPyramid {
    public static void main(String args[]){
        int n=5;

        // outer for loop
        for(int i=1;i<=n;i++){
            // inner for loop --> space print
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }

            // inner for loop --> star print
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
