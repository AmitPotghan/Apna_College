public class fibonacci{
    //Using Recursion
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    //using Dynamic programming-->memoization
    public static int fibDp(int n,int dp[]){
        if (n==0 || n==1){
            return n;
        }
        if (dp[n] != 0){                //fib of n is already calculated 
            return dp[n];            //hence no need to call function 
        }
        //if not calculated
        dp[n] = fibDp(n-1,dp) + fibDp(n-2,dp);
        return dp[n];

    }
    //using Dynamic Programming-->Tabulation
    public static void fibDpTabulation(int n){
        int dp[] = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println("Ans :"+dp[n]);
    }
    public static void main(String[] args) {
        // System.out.println(fib(45));

        // int n=6;
        // int dp[] = new int[n+1];
        // System.out.println(fibDp(n,dp));

        fibDpTabulation(6);
    }
}
