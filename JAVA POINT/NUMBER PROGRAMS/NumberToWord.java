import java.util.*;

public class NumberToWord {
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
        
        String OneToTen[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String ElevenToNinteen[] = {"", "Eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
        String TwentyToNinty[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};


        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("number is zero.");
        }
        else if(number > 0 && number < 10){
            System.out.println("number is " + OneToTen[number]);
        }
        else if(number > 10 && number <20){
            System.out.println("number is " + ElevenToNinteen[number%10]);
        }
        else if(number > 20 && number < 100){
            int lastdigit = number%10;
            int firstdigit = reverse(number)%10;
            System.out.println("number is " + TwentyToNinty[firstdigit] + " " + OneToTen[lastdigit]);
        }
        else if(number == 100){
            System.out.println("number is Hundred.");
        }
    }
}