import java.util.*;

public class Xpowern {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpow = x * power(x, n-1);
        return xpow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number x = ");
        int x = sc.nextInt();
        System.out.print("Enter power n = ");
        int n = sc.nextInt();

        System.out.println("Answer = " + power(x,n));
    }
}