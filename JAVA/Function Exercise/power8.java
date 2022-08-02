import java.util.*;

public class power8 {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        else{
            return x * pow(x, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(pow(x,n));
    }
}
