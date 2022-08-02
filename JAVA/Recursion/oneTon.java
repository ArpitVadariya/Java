import java.util.*;

/**
 * oneTon
 */
public class oneTon {

    public static void printNumber(int first,int last){
        if(first == last+1){
            return;
        }
        System.out.println(first);

        printNumber(first+1,last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int first = sc.nextInt();

        System.out.print("Last number = ");
        int last = sc.nextInt();

        printNumber(first,last);
    }
}