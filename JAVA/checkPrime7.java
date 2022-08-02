/**
 * checkPrime
 */
import java.util.*;

public class checkPrime7 {

    public static void prime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
                }
        }
        if(isPrime) {
                if(n == 1) {
                    System.out.println("This is neither prime not composite");
                } 
                else {
                    System.out.println(n + " is a prime number");
                }
            } 
            else {
                System.out.println(n + " is not a prime number");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr number = ");
        int n = sc.nextInt();

        prime(n);

    }
}