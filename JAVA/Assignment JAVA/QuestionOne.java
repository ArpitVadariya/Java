// Write a java program to find the frequency of given number.
import java.util.*;

public class QuestionOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int number = sc.nextInt();

        int arr[] = new int[10];

        while(number!=0){
            int reminder = number%10;
            arr[reminder]++;
            number = number/10;
        }

        for(int i=0;i<10;i++){
            if(arr[i] != 0){
                System.out.println("number " + i + "-->" + arr[i]);
            }
        }
    }
}