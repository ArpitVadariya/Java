import java.util.*;

public class nTo1 {

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        printNumber(n-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        printNumber(n);

    }    
}