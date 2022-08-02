import java.util.*;

public class Table {
    public static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        multiplicationTable(n);
    }
}