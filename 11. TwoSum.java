package GitHubProject;
import java.util.*;
public class TwoSum {
    public static void usingApproch1(int[] a) {
        int n = a.length;
        int product = 1;
        for(int i : a){
            product*=i;
        }
        int[] ans = new int[n];
        Arrays.fill(ans,product);
        for(int i = 0 ; i < n ;i++){
            ans[i]/=a[i];
        }
        System.out.print("Array : "+Arrays.toString(ans));
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of input : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter values : ");
        for(int i = 0 ; i < n ;i++){
            arr[i] = scn.nextInt();
        }
        usingApproch1(arr);
        scn.close();
    }
}
