package GitHubProject;
import java.util.*;
public class CheckAnagram {
    public static boolean Check(String s1 , String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        Arrays.fill(freq1,0);
        Arrays.fill(freq2,0);
        for(int i = 0 ; i < s1.length();i++){
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        for(int i = 0 ; i < 256 ;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = scn.nextLine();
        System.out.print("Enter String 2 : ");
        String s2 = scn.nextLine();
        boolean ans = Check(s1,s2);
        if(ans){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        scn.close();
    }
}
