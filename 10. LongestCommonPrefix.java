package GitHubProject;
import java.util.*;
public class LongestCommonPrefix {
    public static String check(String[] s){
        String ans = s[0];
        for(int i = 1 ;i < s.length ;i++){
            for(int j = 0 ; j < Math.min(s[i].length(),ans.length()) ;j++){
                if(s[i].charAt(j)!=ans.charAt(j)){
                    ans = s[i].substring(0, j);
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number of Strings : ");
        int n = scn.nextInt();
        String[] var = new String[n];
        System.out.print("Enter the values with space between them : ");
        for(int i = 0 ; i < n ;i++){
            var[i] = scn.next();
        }
        String ans = check(var);
        System.out.println("Longest SubString : "+ans);
    }
}
