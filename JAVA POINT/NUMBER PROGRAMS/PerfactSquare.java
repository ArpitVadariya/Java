import java.util.*;

public class PerfactSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int number = sc.nextInt();
        double sqrt = Math.sqrt(number);
        
        if(sqrt - Math.floor(sqrt) == 0){
            System.out.println(number + " is perfact square.");
        }
        else{
            System.out.println(number + " is not perfact square.");
        }
    }
}
