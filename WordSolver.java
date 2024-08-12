package GitHubProject;
import java.util.*;
public class WordSolver {
    public static void finder(char[][] grid,String s){
        char[] values = s.toCharArray();
        int size = values.length -1;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i<n-size){
                    boolean flag = true;
                    int index = 0;
                    for(int k = i ; k <= i+size ;k++ ){
                        if(grid[k][j]!=values[index++]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("Values found in downwards direction at row number : "+(i+1)+" and column number "+(j+1));
                    }
                }
                if(j < m-size){
                    boolean flag = true;
                    int index = 0;
                    for(int k = j ; k <= j+size ;k++ ){
                        if(grid[i][k]!=values[index++]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("Values found in Frontwards direction at row number : "+(i+1)+" and column number "+(j+1));
                    }
                }
                if(i<n-size && j < m-size){
                    boolean flag = true;
                    int index = 0;
                    for(int k1 = i , k2 = j ; k1<=i+size &&  k2<= j+size ;k1++,k2++ ){
                        if(grid[k1][k2]!=values[index++]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        System.out.println("Values found in Diagonal direction at row number : "+(i+1)+" and column number "+(j+1));
                    }
                }
            }
        } 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        char[][] grid = new char[n][m];
        for(int i = 0; i < n ; i++){
            System.out.print("Enter the Characters for "+(i+1)+"th row : ");
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = scn.next().charAt(0);
            }
        }
        System.out.print("Enter the number of values you want to find : ");
        int count = scn.nextInt();
        String[] values = new String[count];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the value : ");
            values[i] = scn.next();
            finder(grid,values[i]);
        }
        scn.close();
    }
}
