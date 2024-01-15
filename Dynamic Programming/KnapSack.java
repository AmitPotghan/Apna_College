import java.util.*;
public class KnapSack {
    //using Recursion
    public static int Knap_Sack(int val[],int wt[],int W,int n){
        if (n == 0 || W == 0){
            return 0;
        }
        if (wt[n-1] <= W){
            //include
            int ans1 =val[n-1] + Knap_Sack(val,wt,W-wt[n-1],n-1);
            //exclude
            int ans2 = Knap_Sack(val,wt,W,n-1);

            return Math.max(ans1,ans2);
        }else{
            return Knap_Sack(val,wt,W,n-1);
        }
    }
    //using knapSack-->memoization
    public static int Knap_Sack2(int val[],int wt[],int W,int n,int dp[][]){
        if (n == 0 || W == 0){
            return 0;
        }
        if (dp[n][W] != -1){//already calculated
            return dp[n][W];
        }
        if (wt[n-1] <= W){
            //include
            int ans1 =val[n-1] + Knap_Sack(val,wt,W-wt[n-1],n-1);
            //exclude
            int ans2 = Knap_Sack(val,wt,W,n-1);

            dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W];
        }else{
            dp[n][W] = Knap_Sack(val,wt,W,n-1);
            return dp[n][W];
        }
    }
    // using knapSack-->Tabulation
    public static int knap_Sack3(int val[],int wt[],int W){
        int n=val.length;
        int dp[][] = new int[n+1][W+1];
        
        //Initialization condition for dp which is base case in recursion
        for (int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for (int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        //filling Bottom up manner
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int v=val[i-1];
                int w=wt[i-1];
                if (w <= j){
                    int Incprofit = v + dp[i-1][j-w];
                    int Excprofit = dp[i-1][j];
                    dp[i][j] = Math.max(Incprofit,Excprofit);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
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
        int val[]={15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int n=val.length;

        // System.out.println("Max Profit is:"+Knap_Sack(val,wt,W,n));

        //knapSack-->memoization
        // int dp[][] = new int[val.length+1][W+1];
        // for (int i=0;i<dp.length;i++){
        //     for (int j=0;j<dp[0].length;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(Knap_Sack2(val,wt,W,n,dp));


        //knapsack Tabulation
        System.out.println("Max Profit is:"+knap_Sack3(val, wt, W));


    }
}
