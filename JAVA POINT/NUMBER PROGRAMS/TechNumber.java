import java.util.*;

public class TechNumber {
    static int countDigit(int number){
        int cnt = 0;
        while(number != 0){
            number = number/10;
            ++cnt;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        if(countDigit(number)%2 == 0){
            int firsthalf = number / (int)Math.pow(10, countDigit(number)/2);
            int lasthalf = number % (int)Math.pow(10, countDigit(number)/2);
            int sumofhalfs = firsthalf + lasthalf;

            if((sumofhalfs * sumofhalfs) == number){
                System.out.println(number + " is Tech number.");
            }
            else{
                System.out.println(number + " is not Tech number.");
            }
        }
    }
}
