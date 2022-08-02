import java.util.*;

public class NthPrimeNumber {
    static ArrayList<Integer> arrlist = new ArrayList<>();
    static int cnt = 0;
    public static void prime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
                }
        }
        if(isPrime) {
                arrlist.add(n);
                cnt++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to print nth prime number : ");
        int nth = sc.nextInt();
        arrlist.add(1);
        int i=2;
        while(cnt < nth){
            prime(i);
            i++;
        }
        // System.out.println(arrlist);
        System.out.println("The " + nth + "th prime number is : " + arrlist.get(nth));
    }
}