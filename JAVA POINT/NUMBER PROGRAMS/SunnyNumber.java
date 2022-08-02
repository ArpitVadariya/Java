import java.util.*;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        
        double sqrt = Math.sqrt(number+1);
        if((sqrt - Math.floor(sqrt)) == 0){
            System.out.println(number + " is Sunny number.");
        }
        else{
            System.out.println(number + " is not Sunny number.");
        }
    }
}
