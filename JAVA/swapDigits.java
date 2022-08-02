import java.util.*;

 public class swapDigits {
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
        System.out.print("Enter number = ");
        int number = sc.nextInt();
        int tempnumber = number;
        int lastdigit = number%10;
        int firstdigit = 0;
        while(number > 0){
            number = number/10;
            if(number<9 && number!=0){
               firstdigit = number;
            }
        }
        number = tempnumber;
        System.out.println("lastdigit = " + lastdigit);
        System.out.println("firstdigit = " + firstdigit);
        // System.out.println(number);
        // to add firstdigit to end you first delete lastdigit and add firstdigit to lastposition
        // example 12345 --> 12341
        number = number/10;
        number = number*10 + firstdigit;
        System.out.println("First digit add at last position = " + number);
        // now reverse the number 
        // example 12341 --> 14321
        number = reverse(number);
        System.out.println("new reversed number = " + number);
        // add lastdigit number to last position of number
        // example 14321 --> 14325
        number = number/10;
        number = number*10 + lastdigit;
        System.out.println("lastdigit add at last position of new reversed number = " + number);
        // again reverse the number
        number = reverse(number);
        System.out.println("Original number = " + tempnumber);
        System.out.println("first and last digit swaped number = " + number);

    }
}