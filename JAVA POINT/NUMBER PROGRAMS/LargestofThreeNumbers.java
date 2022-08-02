import java.util.*;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + " is Largest.");
            }
            else{
                System.out.println(c + " is Largest.");
            }
        }
        else{
            if(b>c){
                System.out.println(b + " is Largest.");
            }
            else{
                System.out.println(c + " is Largest.");
            }
        }
    }
}
