package GitHubProject;
import java.util.*;
public class SearchInInfiniteSortedArray {
    public static void checkUsingBinarySearch(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(!(arr[start]<=target && arr[end]>= target)){
            start = end+1;
            end = end*2;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                System.out.println("The index value is "+mid);
                return;
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the values : ");
        for(int i= 0 ; i < n ;i++){
            arr[i]=scn.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = scn.nextInt();
        checkUsingBinarySearch(arr,target);
        scn.close();
    }
}
