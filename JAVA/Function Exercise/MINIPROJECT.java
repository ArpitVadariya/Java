import java.util.*;

public class MINIPROJECT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);
        int yourNumber = 0;

        do{
            System.out.print("Guess my Number : ");
            yourNumber = sc.nextInt();

            if(yourNumber == myNumber){
                System.out.println("Woohoo Coreect Number");
                break;
            }
            else if(yourNumber > myNumber){
                System.out.println("Your Number is Large");
            }
            else{
                System.out.println("Your Number is Small");
            }
        }while(yourNumber >= 0);

        System.out.print("my number was : " + myNumber);
    }
}