package GitHub;
import java.util.*;
public class CountIslands {
    static Scanner scn = new Scanner(System.in);
    public static void input(int n , int m , int[][] mat){
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the inputs for line "+(i+1)+" : ");
            for (int j = 0; j < m; j++) {
                mat[i][j]=scn.nextInt();
            }
        }
        System.out.println();
    }
    public static void print(int n , int m , int[][] mat){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void destroy(int[][] mat , int i , int j){
        if(i >= 0 && i < mat.length && j >= 0 && j < mat[0].length && mat[i][j]==1){
            mat[i][j] = 0 ;
            destroy(mat,i-1,j);
            destroy(mat,i+1,j);
            destroy(mat,i,j-1);
            destroy(mat,i,j+1);
        }
    }
    public static int code(int[][]mat){
        int islands = 0 ;
        for(int i = 0 ; i < mat.length ; i++){
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]==1){
                    islands++;
                    destroy(mat,i,j);
                }
            }
        }
        return islands;
    }
    public static void main(String[] args) {
        int n , m ;
        System.out.print("Enter row and col number : ");
        n = scn.nextInt();
        m = scn.nextInt();
        int[][] mat = new int[n][m];
        input(n , m , mat);
        print(n,m,mat);
        System.out.println("Number of Islands are : "+(code(mat)));
    }
}
