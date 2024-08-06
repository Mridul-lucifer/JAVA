package GitHubProject;
import java.util.*;
public class CeilingFloorOfTarget {
    public static void codePart(int[] arr,int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                System.out.println("Ceiling and Floor of element is : "+target);
                return;
            }else if(arr[mid] < target){
                s = mid +1 ;
            }else{
                e = mid -1;
            }
        }
        System.out.println("Ceiling Element is : "+arr[s]);
        System.out.println("Floor of the Element is "+arr[e]);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the values of array : ");
        for(int i = 0 ; i < n ;i++){
            arr[i] = scn .nextInt();
        }
        System.out.print("Enter the target : ");
        int target = scn.nextInt();
        codePart(arr,target);
        scn.close();
    }
}
