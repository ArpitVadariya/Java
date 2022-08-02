import java.util.*;

public class NumberPosorNegorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int number = sc.nextInt();

        if(number<0){
            System.out.println(number + " is negative.");
        }
        else if(number>0){
            System.out.println(number + " is positive.");
        }
        else{
            System.out.println(number + " is zero.");
        }
    }
}
