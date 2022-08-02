import java.util.*;

public class checkEven7 {
    public static void Even(int n){
        if(n%2==0){
            System.out.println(n + " is even number.");
        }
        else{
            System.out.println(n + " is not even number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n=sc.nextInt();
        Even(n);
    }
}
