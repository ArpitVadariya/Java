import java.util.*;

public class RandomStringGenerate {
    public static String randomWordgenerate(int length){
        String characters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String word = "";

        Random rd = new Random();

        char[] text = new char[length];
        
        for(int i=0;i<length;i++){
            text[i] = characters.charAt(rd.nextInt(characters.length()));
        }

        for(int i=0;i<length;i++){
            word += text[i];
        }
        System.out.println(word);
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Random rd = new Random();
        int cnt = 0;
        System.out.print("Enter String Length = ");
        int length = sc.nextInt();
        String word = randomWordgenerate(length);
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
        System.out.println("If you want to enter space than enter - ");
        while(!str.equals(word)){
            System.out.print("Enter one character in uppercase: ");
            char character = sc.next().charAt(0);
            ++cnt;
            for(int i=0;i<word.length();i++){
                if(character == '-'){
                    character = ' ';
                }
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
        System.out.println("Wohho you won the game");
        System.out.println("you take " + cnt + " Guesses to win th game.");
    }
}