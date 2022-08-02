import java.util.*;

public class Calculator3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2;     //two integer variables declared
        System.out.print("Enter number 1 = ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 = ");
        num2 = sc.nextInt();

        int addition = num1 + num2;     //addition variable declared
        int substraction = num1 - num2;     //substarction variable declared
        int multiplication = num1 * num2;     //multiplication variable declared
        int divison = num1 / num2;     //divison variable declared
        int modulo = num1 % num2;     //modulos variable declared        

        System.out.println("---------------------------------------------");
        System.out.println("   Addition of " + num1 +" and " + num2 + " is " + addition);
        System.out.println("   Substraction of " + num1 +" and " + num2 + " is " + substraction);
        System.out.println("   Multiplication of " + num1 +" and " + num2 + " is " + multiplication);
        System.out.println("   Divison of " + num1 +" and " + num2 + " is " + divison);
        System.out.println("   Modulos of " + num1 +" and " + num2 + " is " + modulo);
        System.out.println("---------------------------------------------");
    }
}
