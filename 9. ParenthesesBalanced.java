package GitHubProject;
import java.util.*;
public class ParenthesesBalanced {
    public static boolean check(String s){
        int val =0;
        int i = 0;
        int n = s.length();
        while(i<n){
            if(s.charAt(i)=='('){
                val++;
            }
            if(s.charAt(i)==')'){
                val--;
            }
            if(val<0){
                return false;
            }
            i++;
        }
        if(val!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Parentheses : ");
        String s = scn.nextLine();
        if(check(s)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
        scn.close();
    }
}
