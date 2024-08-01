package GitHubProject;
import java.util.*;
public class StringContainingAllCharacters {
    public static boolean check(String s, String c){
        int[] sF = new int[256];
        int[] cF = new int[256];
        for(int i = 0 ;i < 256 ;i++){
            sF[i]=0;
            cF[i]=0;
        }
        for(int i = 0 ; i < s.length();i++){
            sF[s.charAt(i)]++;
        }
        for(int i = 0 ; i < c.length();i++){
            cF[c.charAt(i)]++;
        }
        for(int i = 0 ; i < 256 ;i++){
            if(cF[i]>sF[i]){
                return false;
            }
        }
        return true;
    }
    public static void lengthWithChars(String s,String c){
        int n = s.length();
        String ans = s;
        for(int i = 0 ; i < n ; i++){
            StringBuilder ss = new StringBuilder();
            for(int j = i  ; j < n ; j++){
                ss.append(s.charAt(j));
                if(check(ss.toString() ,c)){
                    if(ans.length()>ss.toString().length()){
                        ans = ss.toString();
                    }
                    break;
                }

            }
        }
        if(ans.length()==s.length()){
            System.out.print("Not Possible ");
        }else{
            System.out.println("The shortest result possible is "+ans);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = scn.nextLine();
        System.out.print("Enter the chars : ");
        String c = scn.nextLine();
        lengthWithChars(s,c);
        scn.close();
    }
}
