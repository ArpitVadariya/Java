import java.util.*;

public class PalindromeNumber {
    public static int reverse(int number){
        int temp = 0;
        while(number>0){
        int reminder = number % 10;
        temp = temp*10 + reminder;
        number = number/10;
        }
        return temp;
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number that you want check plaindrom or not : ");
        int number = sc.nextInt();

        if(number == reverse(number)){
            System.out.println("The number " + number + " is Palindrome.");
        }
        else{
            System.out.println("The number " + number + " is not Palindrome.");
        }
    }
}
