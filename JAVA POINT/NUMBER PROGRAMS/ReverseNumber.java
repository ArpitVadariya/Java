import java.util.*;

public class ReverseNumber {
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

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        System.out.println("Reverse number : " + reverse(number));
    }
}