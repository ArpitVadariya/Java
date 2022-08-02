import java.util.*;

public class voteage5 {
    public static void vottingEligible(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("yes you are eligible for votting");
        }
        else {
            System.out.println("no you are not eligible for votting");
        }
    }
    public static void main(String[] args) {
        
        vottingEligible();
    }
}