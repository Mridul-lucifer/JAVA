package GitHub;
import java.util.*;

public class SudokoSolver {
    public static boolean checks(int[][] mat, int i , int j ) {
        int[] arr1 = new int[9];
        Arrays.fill(arr1,0);
        for(int k = 0 ; k < 9 ; k++){
            if(mat[i][k]!=0) {
                arr1[mat[i][k] - 1]++;
            }
        }
        for(int index = 0 ; index < 9; index++){
            int val = arr1[index];
            if(val>=2){
                return false;
            }
        }
        int[] arr2 = new int[9];
        Arrays.fill(arr2,0);
        for(int k = 0 ; k < 9 ; k++){
            if(mat[k][j]!=0){
                arr2[mat[k][j] -1 ]++;
            }
        }
        for(int index = 0 ; index < 9; index++){
            int val = arr2[index];
            if(val>=2){
                return false;
            }
        }
        int[] arr3 = new int[9];
        Arrays.fill(arr3,0);
        int v = (i/3)*3;
        for(int k = v; k < v + 3 ; k++){
            int value = (j/3)*3;
           for(int kk = value  ; kk < value+3 ; kk++){
               if(mat[k][kk]!=0){
                   arr3[mat[k][kk] -1 ]++;
               }
           }
        }
        for(int index = 0 ; index < 9; index++){
            int val = arr3[index];
            if(val>=2){
                return false;
            }
        }
        return true;
    }

    public static boolean recursionFunction(int[][] mat , int i , int j ){
        if(i >= 9) {
            return true;
        }
        if(mat[i][j]==0) {
            for (int val = 1; val < 10; val++) {
                boolean check = false;

                mat[i][j] = val;
                if (checks(mat, i, j)) {
                    if (j == 8) {
                        check = recursionFunction(mat, i + 1, 0);
                    } else {
                        check = recursionFunction(mat, i, j + 1);
                    }
                }
                if (check) {
                    return true;
                }
            }
            mat[i][j] = 0;
            return false;
        }else{
            if (j == 8) {
                return recursionFunction(mat, i + 1, 0);
            } else {
                return recursionFunction(mat, i, j + 1);
            }
        }
    }
    public static void codeForSolving(int[][] mat){
        boolean possible = recursionFunction(mat,0,0);
        System.out.println(possible);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        for(int i = 0 ; i < 9 ; i ++){
            System.out.print("Enter the values for line number "+(i+1)+" : ");
            for(int j =  0 ; j < 9 ; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        codeForSolving(matrix);
        System.out.println("Result : ");
        for(int[] i : matrix ){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
