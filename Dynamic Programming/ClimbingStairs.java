
public class ClimbingStairs {
    //using recursion
    public static int countWays(int n){
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        return countWays(n-1)+ countWays(n-2);
    }
    //using Dynamic Programming-->Memoization
    public static int countWays2(int n,int dp[]){
        
        if (n == 0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        dp[n]=countWays2(n-1,dp)+countWays2(n-2,dp);
        return dp[n];

    }
    public static int countWays3(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        
        for (int i=1;i<=n;i++){
            if (i == 1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        // System.out.println("No of Ways to Reach Nth Stair:"+countWays(5));

        // int n=5;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // System.out.println(countWays2(5, dp));

        System.out.println(countWays3(5));
    }
}
