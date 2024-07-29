package GitHubProject;
import java.util.*;
public class MinimumCostToConvertString1 {
    public static long cost(String s1 , String s2,char[]old_c,char[]new_c,int[]costs) {
        int[][] per_cost = new int[26][26];
        for(int i = 0 ; i < 26;i++){
            for(int j =  0; j < 26;j++){
                if(i==j){
                    per_cost[i][j]=0;
                }else{
                    per_cost[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        for(int i = 0 ; i < old_c.length;i++){
            per_cost[old_c[i]-'a'][new_c[i]-'a']=Math.min(costs[i],per_cost[old_c[i]-'a'][new_c[i]-'a']);
        }
        // k Algo
        for(int k = 0 ; k < 26 ;k++){
            for(int i = 0 ; i < 26 ;i++){
                for(int j = 0 ; j < 26 ;j++){
                    if(per_cost[i][k]!=Integer.MAX_VALUE && per_cost[k][j]!=Integer.MAX_VALUE){
                        per_cost[i][j]= Math.min(per_cost[i][j],(per_cost[i][k]+per_cost[k][j]));
                    }
                }
            }
        }
        long min_cost =0;
        for(int i = 0 ; i < s1.length();i++){
            int val =  per_cost[s1.charAt(i)-'a'][s2.charAt(i)-'a'];
            if(val==Integer.MAX_VALUE){
                return -1;
            }
            min_cost+=val;
        }
        return min_cost;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter the Original String : ");
        s1 = scn.nextLine();
        System.out.print("Enter the Needed String : ");
        s2 = scn.nextLine();
        int n ;
        System.out.print("Enter the size of ways to convert : ");
        n = scn.nextInt();
        char[] oldChar = new char[n];
        System.out.print("Enter the Old charaters : ");
        for(int i = 0 ; i < n ;i++){
            oldChar[i] = scn.next().charAt(0);
        }
        char[] newChar = new char[n];
        System.out.print("Enter the New characters : ");
        for(int i = 0 ; i < n ;i++){
            newChar[i] = scn.next().charAt(0);
        }
        int[] costs = new int[n];
        System.out.print("Enter the cost for conversion : ");
        for(int i = 0 ;i < n ;i++){
            costs[i] = scn.nextInt();
        }
        System.out.println("Minimum Cost is : "+cost(s1,s2,oldChar,newChar,costs));
        scn.close();

    }
}
