                            //         * * * * * 

                            //       *       *   

                            //     *       *     

                            //   *       *       

                            // * * * * *         
public class HollowRhombus {
    public static void main(String[] args) {
        int n=5;

        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop --> space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            } 

            // inner loop --> star 
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    if(j==1 || j==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
            System.out.println();
        }



        // only for invert hollowrhombus
        // for(int i=n;i>=1;i--){
        //     // inner loop --> space
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     } 

        //     // inner loop --> star 
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || i==n){
        //             System.out.print("* ");
        //         }
        //         else{
        //             if(j==1 || j==n){
        //                 System.out.print("* ");
        //             }
        //             else{
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        //     System.out.println();
        // }
    }
}
