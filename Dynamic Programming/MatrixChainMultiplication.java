import java.util.*;
public class MatrixChainMultiplication {
    public static int mcm(int arr[],int i ,int j){
        if (i == j){        //Single matrix so cost is zero
            return 0;
        }
        int MinimunCost = Integer.MAX_VALUE;
        for (int k = i;k<=j-1;k++){
            int cost1 = mcm(arr,i,k); //order of resultant matrix is :arr[i-1] X arr[k]
            int cost2 = mcm(arr,k+1,j); //similarly : arr[k] X arr[j]

            int cost3 = arr[i-1] * arr[k] * arr[j];  
            int finalCost = cost1 + cost2 + cost3;
            MinimunCost = Math.min(MinimunCost,finalCost);
        }
        return MinimunCost;
    }
    public static int mcmMem(int arr[],int i,int j,int dp[][]){
        if (i == j){
            return 0;
        }
        if (dp[i][j] != -1){  //already calculated
            return dp[i][j];
        }
        int MinimunCost = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            MinimunCost = Math.min(finalCost,MinimunCost);
        }
        return dp[i][j] = MinimunCost;
    }
    public static int mcmTab(int arr[]){
        int n = arr.length;
        int dp[][] = new int[n][n];

        //initialization
        for (int i=0;i<dp.length;i++){
            dp[i][i] = 0;
        }
        for (int len=2;len<=n-1;len++){
            for (int i=1;i<=n-len;i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k=i;k<=j-1;k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(cost1+cost2+cost3,dp[i][j]);
                }
            }
        }
        print(dp);
        
        return dp[1][n-1];
    }
    public static void print(int dp[][]){
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n = arr.length;
        // System.out.println(mcm(arr, 1, n-1));

        // int dp[][] = new int[n][n];
        // for (int i=0;i<dp.length;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // System.out.println(mcmMem(arr, 1, n-1, dp));

        System.out.println(mcmTab(arr));

    }
}
