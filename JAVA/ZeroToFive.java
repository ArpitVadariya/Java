import java.util.*;

public class ZeroToFive {

    public static int convert(int number){
        if(number == 0){
            return 5;
        }
        else{
            // 1005-->100-->10-->1-->0
            int temp = 0;
            while(number>0){
                int reminder = number%10;
                if(reminder == 0){
                    reminder = 5;
                }
                // 5-->(0 to 5)55-->(0 to 5)555--> temp = 5551
                temp = temp*10 + reminder;
                number = number/10;
            }
            int ans = 0;
            // reverse temp
            while(temp>0){
                int reminder = temp%10;
                ans = ans*10 + reminder;
                temp = temp/10;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        System.out.println("replaced 0 to 5 number = " + convert(number));

    }
}