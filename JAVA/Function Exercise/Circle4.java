import java.util.*;

public class Circle4 {
    public static double circumference(int r){
        return (2 * 3.14 * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle r = ");
        int r = sc.nextInt();

        System.out.println("Circumference of circle is " + circumference(r));
    }
}
