import java.util.*;

public class SmallestofThreeUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        System.out.print("Enter c = ");
        int c = sc.nextInt();
        int smallest = (a<b && a<c) ? a : (b<c) ? b : c;
        System.out.println(smallest + " is smallest number.");
    }
}
