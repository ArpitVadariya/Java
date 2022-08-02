import java.util.*;

public class PetternMatching {
    public static void main(String[] args) {
        String str = "ABCDAABCDBBBCD";
        System.out.println(str.length());
        String sub = "BCD";
        System.out.println(sub.length());
        System.out.println("-----------");
        // make to character array and store string characters
        char astr[] = str.toCharArray();
        char asub[] = sub.toCharArray();
        System.out.println(str.substring(1, 4));
        for(int i=0;i<astr.length;i++){
            // check first char of substring and ith character of strarray is match or not
            if(astr[i] == asub[0]){
                // if matchs then make substring of string of length of substring length then compare without ignoring case using string.equals(substring) method
                if(sub.equals(str.substring(i, i+sub.length()))){
                    // if compare successfully then print index number
                    System.out.println("substring match at index " + i);
                }
            }
        }
        System.out.println("----------------");
    }
}
