// Write a program in java creates 3 different class.customer class displays the current data of customers who book ticket for reservation in railway.Ticket_book class is used to book the tickets and Ticket_cancel is used to cancel ticket reservation.

import java.util.*;

class Ticket_Book{
    static String name, destination;
    static int NoOfTicket;

    public static void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.next();
        System.out.print("Enter number of Tickets : ");
        NoOfTicket = sc.nextInt();
        System.out.print("Enter Destination : ");
        destination = sc.next();
    }
}

class Ticket_Cancel extends Ticket_Book{
    static int CancelTicket;
    public void getCancel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Tickets would you want to cancel : ");
        CancelTicket = sc.nextInt();
        while(CancelTicket > NoOfTicket){
            System.out.println("please enter number less than " + NoOfTicket);
            CancelTicket = sc.nextInt();
        }
        NoOfTicket = NoOfTicket - CancelTicket;
    }
}

class Reservation extends Ticket_Cancel{
    public void display(){
        getdata();
        getCancel();
        System.out.println("Customer name : " + name);
        System.out.println("number of tickets : " + NoOfTicket);
        System.out.println("From Junagadh To " + destination);
        System.out.println("Total amount : " + (NoOfTicket*100));
        System.out.println("Happy Journey");
        System.out.println();
    }
}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservation rsv = new Reservation();
        System.out.print("How many Customers : ");
        int customers = sc.nextInt();
        for(int i=1;i<=customers;i++){
            System.out.println("Customer " + i + " details.");
            rsv.display();
        }
    }
}