import java.util.*;

public class SwapNumberUsingBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int firstnumber = sc.nextInt();
        System.out.print("Enter Second number : ");
        int secondnumber = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("First number = " + firstnumber);
        System.out.println("Second number = " + secondnumber);

        
        firstnumber = firstnumber ^ secondnumber;
        secondnumber = firstnumber ^ secondnumber;
        firstnumber = firstnumber ^ secondnumber;

        System.out.println("After Swap");
        System.out.println("First number = " + firstnumber);
        System.out.println("Second number = " + secondnumber);
    }
}
