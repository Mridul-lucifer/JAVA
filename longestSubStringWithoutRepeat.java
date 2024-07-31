package GitHubProject;
import java.util.*;
public class longestSubStringWithoutRepeat {
    static void lengthOfLongestSubString(String s){
        List<String> values  = new ArrayList<>();
        int n = s.length();
        int max = 0 ;
        StringBuilder ss = new StringBuilder();
        int index = 0 ; 
        String val = "";
        while(index<n){
            for(int i = 0 ; i < ss.length() ;i++){
                if(ss.charAt(i)==s.charAt(index)){
                    ss.delete(0, i+1);
                    break;
                }
            }
            ss.append(s.charAt(index));
            if(ss.length()>max){
                max = ss.length();
                values = new ArrayList<>();
            }
            if(ss.length()==max){
                values.add(ss.toString());
            }
            index++;
        }
        System.out.println("The Max length is : "+max);
        System.out.print("SubStrings are : ");
        for(String i : values){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = scn.nextLine();
        lengthOfLongestSubString(s);
        scn.close();
    }
}
