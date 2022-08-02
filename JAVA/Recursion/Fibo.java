import java.util.*;

public class Fibo {
    public static void printFib(int a,int b,int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1;
        System.out.print("How many numbers would you print = ");
        int n = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        
        printFib(a, b, n-2);
    }
}
