package GitHubProject;

import java.util.Scanner;

public class BinarySearchInSorted2DArray {
    
    public static void input(int[][] matrix,int n,int m,Scanner scn) {
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter values of "+(i+1)+"th row : ");
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
    }
    public static String outputUsingBinarySearch(int[][] mat ,int t) {
        int n = mat.length;
        int m = mat[0].length;
        int start = 0;
        int end = n -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mat[mid][0]<=t && mat[mid][m-1]>=t){
                start = mid;
                end = mid-1;
                break;
            }else if(mat[mid][0]>t){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        int row = start;
        if(row>n-1) return "Not Present";
        start = 0;
        end = m-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mat[row][mid]==t){
                return ("Target is present in "+(row+1)+"th row and "+(mid+1)+"th column");
            }else if(mat[row][mid]>t){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return "Not Present ";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n , m ;
        System.out.print("Enter number of rows : ");
        n = scn.nextInt();
        System.out.print("Enter number of Colms : ");
        m = scn.nextInt();
        int[][] matrix = new int[n][m];
        input(matrix,n,m,scn);
        int times;
        System.out.print("Enter number of targets want to check : ");
        times = scn.nextInt();
        for(int i = 0 ; i < times;i++){
            System.out.print("Enter "+i+"th target : ");
            int target = scn.nextInt();
            System.out.println(outputUsingBinarySearch(matrix,target));
        }
        scn.close();
    }
    
}
