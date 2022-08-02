// Write a JAVA program to apply method overloading.create a class shape which contains method area and apply method overloading to calculate rectangle area,circle area, Parallelogram area. Formula for area calculation: Parallelogram area: A=bh(b=base,h=height) Circle area: A=pi*r2 Rectangle area: A= wl(w=width,l=length)

import java.util.*;

class SHAPE{
    public static double Area(int radius, double pi){
        return (pi*radius*radius);
    }

    public static int Area(int length, int width){
        return (length*width);
    }

    public static double Area(double base, double height){
        return (base*height);
    }
}

public class Q2 {
    public static double pi = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SHAPE sh = new SHAPE();

        System.out.print("Enter Radius : ");
        int radius = sc.nextInt();
        System.out.println("Area of Circle is " + sh.Area(radius , pi));

        System.out.println();

        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter width : ");
        int width = sc.nextInt();
        System.out.println("Area of Rectangle is " + sh.Area(length , width));

        System.out.println();

        System.out.print("Enter base : ");
        double base = sc.nextDouble();
        System.out.print("Enter height : ");
        double height = sc.nextDouble();
        System.out.println("Area of paralleolgram is " + sh.Area(base , height));
    }
}