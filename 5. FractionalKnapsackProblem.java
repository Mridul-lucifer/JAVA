package GitHubProject;
import java.util.*;
public class FractionalKnapsackProblem {
    static void codeForSolution(int[][] data , int max_weight){
        int n = data.length;
        float ratio[] = new float[n];
        for(int i = 0 ; i < n ;i++){
            ratio[i] = (float) data[i][1]/data[i][0];
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = i +1; j < n ;j++){
                if(ratio[i]<ratio[j]){
                    float a = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = a;
                    int[] b = data[i];
                    data[i] = data[j];
                    data[j] = b;
                }
            }
        }
        float profit = 0;
        int index = 0;
        while(max_weight>0 && index<n){
            if(data[index][0]<=max_weight){
                profit += data[index][1];
                max_weight-=data[index][0];
            }else{
                profit += (float)(max_weight)*ratio[index];
                max_weight-=data[index][0];
            }
            index++;
        }
        System.out.println("The Max Profit is "+profit);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of 2d Array : ");
        int n = scn.nextInt();
        int[][] data = new int[n][2];
        for(int i = 0 ; i < n ;i++){
            System.out.print("Enter the data (weight , price): ");
            data[i][0] = scn.nextInt();
            data[i][1] = scn.nextInt();
        }
        System.out.print("Enter weight in our hand : ");
        int max_weight = scn.nextInt();
        codeForSolution(data,max_weight);
        scn.close();
    }
}
