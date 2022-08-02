import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int tempnumber = number;
        int sum = 0;
        while(number != 0){
            int reminder = number % 10;
            sum = sum + (reminder*reminder*reminder);
            number = number/10;
        }
        
        if(sum == tempnumber){
            System.out.println(tempnumber + " is Armstrong number.");
        }
        else{
            System.out.println(tempnumber + " is not Armstrong number.");
        }
    }
}
