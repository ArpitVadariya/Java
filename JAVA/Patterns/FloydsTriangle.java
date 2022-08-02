// 1 

// 2  3        

// 4  5  6     

// 7  8  9  10 

// 11  12  13  14  15

public class FloydsTriangle {
    public static void main(String args[]){
        int n=5;
        int number=1;
        // outer for loop
        for(int i=1;i<=n;i++){
            // inner for loop
            for(int j=1;j<=i;j++){
                System.out.print(" " + number + " ");
                number++;
            }
            System.out.println();
            System.out.println();
        }
    }
}
