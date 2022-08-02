import java.util.*;

public class Marks4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num ;

        do{
            System.out.print("Enter marks out of 100 --> ");
            int marks = sc.nextInt();

            if(marks<=100 && marks>=90){
                System.out.println("This is Good.");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("This is also Good.");
            }
            else if(marks<=59 && marks>=0){
                System.out.println("This is Good as well.");
            }
            System.out.println("want to cotinue? YES(1) or NO(0)");
            num = sc.nextInt();
        }
        while(num==1);

        if (num==0){
            System.out.println("STOP");
        }
    }
}