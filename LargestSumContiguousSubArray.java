package GitHub;
import java.util.*;
public class LargestSumContiguousSubArray {
    public static int codeForMaxSum(int[]arr){
        int max = 0;
        int sum = 0;
        for(int i : arr){
            sum += i;
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int maxSum = codeForMaxSum(arr);
        System.out.println("Max sum possible for continuous Sub Array is "+maxSum);
    }
}
