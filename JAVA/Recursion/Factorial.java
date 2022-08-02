import java.util.*;

public class Factorial {
    public static void sum(int first,int last, int fact){
        if(first == last+1){
            System.out.println(fact);
            return;
        }

        fact = fact * first;
        sum(first+1, last, fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int first = sc.nextInt();

        System.out.print("Last number = ");
        int last = sc.nextInt();

        int fact = 1;

        sum(first, last, fact);
    }
}