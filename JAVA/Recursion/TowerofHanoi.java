/**
 * TowerofHanoi
 */
import java.util.*;

public class TowerofHanoi {
    public static void hanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        hanoi(n-1,src,dest,helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        hanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        hanoi(n, "source", "helper", "dest");
    }
}