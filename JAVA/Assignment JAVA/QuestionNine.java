// Develop console application to guess a word using given clues and else if ladder

import java.util.*;

public class QuestionNine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a string : ");
        String word = "HARRYPOTTER";
        String str = "";
        char ch[] = new char[word.length()];
        for(int i=0;i<word.length();i++){
            ch[i] = word.charAt(i);
        }

        // for(int i=0;i<word.length();i++){
        //     System.out.println(ch[i]);
        // }  
        
        char c[] = new char[word.length()];
        char arr[] = new char[word.length()];

        for(int i=0;i<word.length();i++){
            arr[i] = '-';
        } 
        int number = 0;
        while(!str.equals(word)){
            System.out.print("Enter one character in uppercase: ");
            char character = sc.next().charAt(0);
            for(int i=0;i<word.length();i++){
                if(character == ch[i]){
                    c[i] = character;
                    arr[i] = c[i];
                }
                else if(character != ch[i]){
                    c[i] = '-';
                }
            }
            for(int i=0;i<word.length();i++){
                System.out.print(arr[i]);
            }
            System.out.println();    
            str = String.valueOf(arr);   
        }
        System.out.println("\nWohho you won the game");
    }
}