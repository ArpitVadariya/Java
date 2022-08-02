import java.util.*;

class SL {
    public static int travel(int userposition) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to throw dice or 0 to quit : ");
        int response = sc.nextInt();

        while (response > 1) {
            System.out.println("Please Enter 1 or 0");
            response = sc.nextInt();
        }

        if (response == 1) {
            int dice = (rd.nextInt(6) + 1);
            System.out.println("dice number : " + dice);
            userposition = userposition + dice;
            if (userposition == 18) {
                userposition = 40;
            } else if (userposition == 28) {
                userposition = 10;
            } else if (userposition == 31) {
                userposition = 52;
            } else if (userposition == 34) {
                userposition = 2;
            } else if (userposition == 60) {
                userposition = 82;
            } else if (userposition == 62) {
                userposition = 37;
            } else if (userposition == 66) {
                userposition = 96;
            } else if (userposition == 91) {
                userposition = 47;
            } else if (userposition == 99) {
                userposition = 74;
            } else if (userposition > 100) {
                userposition = userposition - dice;
            }

            return userposition;
        } else {
            System.out.println("you quit the game.");
            return 100;
        }

    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("how many player will play : ");
        int players = sc.nextInt();

        int userposition[] = new int[players];

        for (int i = 0; i < players; i++) {
            userposition[i] = 1;
        }
        int total = 0;
        while (total < (100 * players)) {
            total = 0;
            for (int i = 0; i < players; i++) {
                if (userposition[i] != 100) {
                    System.out.println("user " + (i + 1) + " : ");
                    userposition[i] = travel(userposition[i]);
                    System.out.println("user " + (i + 1) + " position : " + userposition[i]);
                    if (userposition[i] == 100) {
                        System.out.println("wohoo user " + (i + 1) + " won the game.");
                    }
                    System.out.println("-------------------------------------------");
                }
            }
            for (int i = 0; i < players; i++) {
                total = total + userposition[i];
            }
            System.out.println();
        }
    }
}