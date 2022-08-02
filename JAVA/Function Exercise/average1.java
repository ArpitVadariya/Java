import java.util.*;

public class average1 {
    public static int averageCount(int a,int b,int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("average is " + averageCount(a,b,c));
    }
}