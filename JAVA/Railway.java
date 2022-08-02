import java.util.*;

class Customer {
    static String name;

    public static void getname() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
    }
}

class Ticket_Book extends Customer {
    static String Begining, Destination;
    static int Ticketnumber;
    static int NoOfTicket;

    public static void getdata() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Choose a number Begining Platform name from Following list : ");
        System.out.println("1. Junagadh");
        System.out.println("2. Rajkot");
        System.out.println("3. Ahmedabad");
        System.out.println("4. Baroda");
        System.out.println("5. Surat");
        int choiceB = sc.nextInt();
        while (choiceB > 5 || choiceB < 1) {
            System.out.println("Please Enter Valid Number For Station");
            choiceB = sc.nextInt();
        }
        switch (choiceB) {
            case 1:
                Begining = "Junagdh";
                break;

            case 2:
                Begining = "Rajkot";
                break;

            case 3:
                Begining = "Ahmedabad";
                break;

            case 4:
                Begining = "Baroda";
                break;

            case 5:
                Begining = "Surat";
                break;
        }
        System.out.println("Choose Destination Platform name from Following list : ");
        System.out.println("1. Junagadh");
        System.out.println("2. Rajkot");
        System.out.println("3. Ahmedabad");
        System.out.println("4. Baroda");
        System.out.println("5. Surat");
        int choiceD = sc.nextInt();
        while (choiceD > 5 || choiceD < 1) {
            System.out.println("Please Enter Valid Number For Station");
            choiceD = sc.nextInt();
        }
        switch (choiceD) {
            case 1:
                Destination = "Junagdh";
                break;

            case 2:
                Destination = "Rajkot";
                break;

            case 3:
                Destination = "Ahmedabad";
                break;

            case 4:
                Destination = "Baroda";
                break;

            case 5:
                Destination = "Surat";
                break;
        }
        while (Begining == Destination) {
            System.out.println("Begining and Destination Platform Can not Be Same");
            choiceD = sc.nextInt();
            while (choiceD > 5 || choiceD < 1) {
                System.out.println("Please Enter Valid Number For Station");
                choiceD = sc.nextInt();
            }
            switch (choiceD) {
                case 1:
                    Destination = "Junagdh";
                    break;

                case 2:
                    Destination = "Rajkot";
                    break;

                case 3:
                    Destination = "Ahmedabad";
                    break;

                case 4:
                    Destination = "Baroda";
                    break;

                case 5:
                    Destination = "Surat";
                    break;
            }
        }
        System.out.print("Enter number of Tickets : ");
        NoOfTicket = sc.nextInt();
        Ticketnumber = (int) (rd.nextDouble() * 10000000);
    }
}

class Ticket_Cancel extends Ticket_Book {
    static int CancelTicket;

    public void Cancel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("would you want to cancel the Tickets Yes or No: ");
        System.out.println("1. YES");
        System.out.println("0. NO");
        int choiceC = sc.nextInt();
        if (choiceC == 1) {
            System.out.print("How many Tickets You want to cancel : ");
            CancelTicket = sc.nextInt();
            NoOfTicket = NoOfTicket - CancelTicket;
            System.out.println(CancelTicket + " Ticket Cancelled.");
            while (CancelTicket > NoOfTicket) {
                System.out.println("please enter number less than " + NoOfTicket);
                CancelTicket = sc.nextInt();
                NoOfTicket = NoOfTicket - CancelTicket;
                System.out.println(CancelTicket + " Ticket Cancelled.");
            }
        }
    }
}

class Reservation extends Ticket_Cancel {
    public void display() {
        getname();
        getdata();
        Cancel();
        System.out.println("Customer name : " + name);
        System.out.println("number of tickets : " + NoOfTicket);
        System.out.println("Your Ticket number : " + +Ticketnumber + " TO " + (Ticketnumber + NoOfTicket) + " From "
                + Begining + " To " + Destination + " generated. ");
        System.out.println();
        System.out.println();
    }
}

public class Railway {

    public static void main(String[] args) {
        Reservation r = new Reservation();
        r.display();
    }
}