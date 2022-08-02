import java.util.*;

public class PrintAndSumofnNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter last number : ");
        int lastnumber = sc.nextInt();

        System.out.println("all odd number from 1 to " + lastnumber);
        for(int i=1;i<=lastnumber;i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("all even number from 1 to " + lastnumber);
        for(int i=1;i<=lastnumber;i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int sum = 0;
        for(int i=0;i<=lastnumber;i++){
            sum = sum + i;
        }
        System.out.println("sum of " + lastnumber + " natural numbers is " + sum);
    }
}
