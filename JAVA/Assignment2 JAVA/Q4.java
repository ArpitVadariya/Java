// Write a JAVA program to create an abstract class Bank which has abstract methods interestrate().calculate interest value of SBI Bank,BOB Bank and Yes Bank.

import java.util.*;

abstract class BANK{
    abstract double interestrate(double price, double rate, int year);
}

public class Q4 extends BANK{
    double interestrate(double price, double rate, int year){
        return ((price * rate * year)/100);
    }
    public static void main(String[] args) {
        Q4 q=new Q4();
        Scanner sc = new Scanner(System.in);
        System.out.println("SBI bank");
        System.out.print("SBI amount : ");
        double Samount = sc.nextDouble();
        double Srate = 5;
        System.out.println("SBI bank interest is " + q.interestrate(Samount, Srate, 1));

        System.out.println("BOB bank");
        System.out.print("BOB amount : ");
        double Bamount = sc.nextDouble();
        double Brate = 7;
        System.out.println("BOB bank interest is " + q.interestrate(Bamount, Brate, 1));

        System.out.println("YES bank");
        System.out.print("YES amount : ");
        double Yamount = sc.nextDouble();
        double Yrate = 2;
        System.out.println("YES bank interest is " + q.interestrate(Yamount, Yrate, 1));
    }
}