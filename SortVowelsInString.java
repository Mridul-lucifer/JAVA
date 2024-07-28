package GitHubProject;
import java.util.*;
public class SortVowelsInString {
    public static String VowelsSort(String s) {
        String ans = "";
        int count = 0;
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u' -> count++ ;
                case 'A','E','I','O','U' -> count++ ;
            }
        }
        char[] vowels = new char[count];
        int index = 0;
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u' -> vowels[index++]=c ;
                case 'A','E','I','O','U' -> vowels[index++]=c ;
            }
        }
        Arrays.sort(vowels);
        index =0 ;
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u' -> ans+=vowels[index++] ;
                case 'A','E','I','O','U' -> ans+=vowels[index++] ;
                default -> ans+=c ;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = scn.nextLine();
        System.out.println("String "+VowelsSort(s));
        scn.close();
    }
}
