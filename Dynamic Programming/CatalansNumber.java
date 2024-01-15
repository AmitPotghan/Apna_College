import java.util.*;
public class CatalansNumber {
    //using recursion
    public static int Catalans(int n){
        //base case
        if (n == 0 || n ==1){
            return 1;
        }
        int ans = 0;
        for (int i=0;i<=n-1;i++){
            ans+=Catalans(i) * Catalans(n-i-1);
        }
        return ans;
    }
    //using memoization
    public static int CatalansMemoization(int n,int dp[]){
        if (n == 0 || n == 1){
            return 1;
        }
        if (dp[n] != -1){  //already calculated
            return dp[n];
        }
        int ans=0;
        for (int i=0;i<=n-1;i++){
            ans += CatalansMemoization(i, dp) * CatalansMemoization(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    //using tabulation
    public static int catalansTab(int n){
        int dp[] = new int[n+1];
        //initialization
        dp[0] = 1;
        dp[1] = 1;

        //first loop for traversing arra
        for (int i=2;i<n+1;i++){
            for (int j=0;j<i;j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=20;
        // System.out.println(Catalans(n));

        //using dp => memoization
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // System.out.println(CatalansMemoization(n, dp));

        //using dp =>Tabulation
        System.out.println(catalansTab(n));
    }
}
