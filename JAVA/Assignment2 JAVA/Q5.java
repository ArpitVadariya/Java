// Write a JAVA program to perform constructor overloading.create a class which contains 2 parameterized constructor one contains integer value as parameter to calculate number is prime or not and second constructor contains String parameter which checks String is palindrome or not.

import java.util.*;

class OVERLOAD{
    OVERLOAD(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } 
            else {
                System.out.println(n + " is a prime number");
            }
        } 
        else {
            System.out.println(n + " is not a prime number");
        }
    }
    OVERLOAD(String str){

        String rev = "";
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        System.out.println();

        System.out.print("Enter a string : ");
        String str = sc.next();

        OVERLOAD o1 = new OVERLOAD(number);
        OVERLOAD o2 = new OVERLOAD(str);
    }
}