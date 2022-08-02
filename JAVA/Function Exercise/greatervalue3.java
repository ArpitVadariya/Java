import java.util.*;

public class greatervalue3 {
    public static int greaterValue(int a,int b){
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("greater value is " + greaterValue(a,b));
    }
}