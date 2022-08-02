import java.util.*;

public class AlternatePrimeNumber {
    public static void prime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
                }
        }
        if(isPrime) {
                System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to print upto n prime number : ");
        int uptoN = sc.nextInt();
        System.out.print("The Alternate prime number upto " + uptoN + " : ");
        for(int i=2;i<uptoN;i++){
            prime(i);
        }
    }
}