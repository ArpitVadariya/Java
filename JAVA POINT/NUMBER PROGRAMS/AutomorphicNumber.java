import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number%100 == (number*number)%100){
            System.out.println(number + " is Automorphic number.");
        }
        else{
            System.out.println(number + " is not Automorphic number.");
        }
    }
}
