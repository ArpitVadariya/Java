import java.util.*;

public class PetersonNumber {
    public static int Factorial(int number){
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int fact[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320};
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int tempnumber = number;
        int sum = 0;
        while(number != 0){
            int reminder = number%10;
            sum = sum + Factorial(reminder);
            number = number/10;
        }
        if(sum == tempnumber){
            System.out.println(tempnumber + " is peterson number.");
        }
        else{
            System.out.println(tempnumber + " is not peterson number");
        }
    }
}
