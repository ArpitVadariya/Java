                        //     1     
                        //    1 1    
                        //   1 2 1   
                        //  1 3 3 1  
                        // 1 4 6 4 1 

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        // outer loop
        for(int i=0;i<n;i++){
            // inner loop --> space
            int temp=1;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // inner loop --> number
            temp=1;
            for(int j=0;j<=i;j++){
                System.out.print(temp + " ");
                // very important line
                temp = temp*(i-j)/(j+1);
            }

            System.out.println();
        }
    }
}
