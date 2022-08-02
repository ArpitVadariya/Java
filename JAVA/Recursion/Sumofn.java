import java.util.*;

public class Sumofn {
    public static void sum(int first,int last, int sum){
        if(first == last+1){
            System.out.println(sum);
            return;
        }

        sum = sum + first;
        sum(first+1, last, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int first = sc.nextInt();

        System.out.print("Last number = ");
        int last = sc.nextInt();

        int sum = 0;

        sum(first, last, sum);
    }
}