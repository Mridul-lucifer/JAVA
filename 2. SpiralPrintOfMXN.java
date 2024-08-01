package GitHubProject;
import java.util.*;
public class SpiralPrintOfMXN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n , m ;
        System.out.print("Enter number of rows : ");
        n = scn.nextInt();
        System.out.print("Enter number of Colms : ");
        m = scn.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter values of "+(i+1)+"th row : ");
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        scn.close();
        int start = 0 ,top = 0, bottom= n-1,end=m-1;
        while(start<=end || top<=bottom){
            for(int i = start ; i <= end;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i = top;i<=bottom ;i++){
                System.out.print(matrix[i][end]+" ");
            }
            end--;
            if(start>end || top>bottom){
                break;
            }
            for(int i = end ; i >= start;i--){
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            for(int i = bottom;i>=top;i-- ){
                System.out.print(matrix[i][start]+" ");
            }
            start++;
        }
    }
}
