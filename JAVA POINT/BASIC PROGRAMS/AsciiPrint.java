import java.util.*;

public class AsciiPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number or character or symbol to get ascii value : ");
        char ch = sc.next().charAt(0);

        System.out.println("The ASCII value of " + ch + " is " + (int)ch);

        System.out.println("ASCII VALUES LIST");
        for(int i=0;i<=255;i++){
            System.out.println("The ASCII value of " + (char)i + " is " + i);
            System.out.println();
        }
    }
}