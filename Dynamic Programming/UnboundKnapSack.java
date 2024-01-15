public class UnboundKnapSack {
    public static int Unbound_KnapSack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][] = new int[n+1][W+1];

        //initialization
        for (int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for (int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int v = val[i-1];
                int w = wt[i-1];
                
                if (wt[i-1] <= j){
                    int ans1 = v + dp[i][j-w];  //include
                    int ans2 = dp[i-1][j];    //exclude
                    dp[i][j] = Math.max(ans1,ans2);
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
    public static void main(String []args){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;

        System.out.println("Max profit is:"+Unbound_KnapSack(val,wt,W));
    }
}
