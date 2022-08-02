import java.util.*;

public class SqrtNumber {
    public static double squareRoot(int number){
        double temp;
        double sqrtroot = number/2;
        do{
            temp = sqrtroot;
            sqrtroot = (temp + (number/temp))/2;
        }while((temp - sqrtroot) != 0);

        return sqrtroot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("The squareroot of " + number + " is " + squareRoot(number));
    }
}
