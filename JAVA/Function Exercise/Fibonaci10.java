import java.util.Scanner;

public class Fibonaci10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=0;
        int b=1;
        int sum = 0;

        System.out.print("Enter last number = ");
        int n = sc.nextInt();

        System.out.print(a + " " + b);

        for(int i=1;i<n;i++){
            sum = a+b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}