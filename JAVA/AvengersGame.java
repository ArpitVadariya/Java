
import java.util.*;

public class AvengersGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();

        String names[] = { "Iron man", "Captain America", "Thor : Odin son", "Hulk", "Black Widow", "Hawkeye", "Falcon",
                "Winter Soldier", "Spider man", "Wanda", "Vision", "Quick Silver", "Black Panther",
                "Loki : The God Of Mischief", "Ant man", "Captain Marvel", "Dr. Strange", "Rocket Racoon", "Groot",
                "Gamora", "Drax", "Nebula", "Star Lord", "Nick Fury", "War Machine", "Wasp", "Wong", "Valkyrie" };

        String word = names[rd.nextInt(names.length)];
        String str = "";
        char ch[] = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }

        // for(int i=0;i<word.length();i++){
        // System.out.println(ch[i]);
        // }

        char c[] = new char[word.length()];
        char arr[] = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            arr[i] = '-';
        }
        System.out.println("If you want to enter space than enter - ");
        while (!str.equals(word)) {
            System.out.print("Enter one character = ");
            char character = sc.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (character == '-') {
                    character = ' ';
                }
                if (character == ch[i]) {
                    c[i] = character;
                    arr[i] = c[i];
                } else if (character != ch[i]) {
                    c[i] = '-';
                }
            }
            for (int i = 0; i < word.length(); i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            str = String.valueOf(arr);
        }
        System.out.println("Wohho you won the game");
    }
}