import java.util.*;

public class Circle2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius in meter = ");
        int radius = sc.nextInt();
        double area = (3.14 * radius * radius);
        System.out.println("radius of circle is " + radius + " meter.");
        System.out.println("area of circle is " + area + " meter square.");
    }
}
