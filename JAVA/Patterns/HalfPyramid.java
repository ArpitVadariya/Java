//  * 

//  *    * 

//  *    *    *       

//  *    *    *    *    

//  *    *    *    *    *
public class HalfPyramid {
    public static void main(String args[]){
        int n=5;

        // outer for loop
        for(int i=1;i<=n;i++){
            // inner for loop
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
