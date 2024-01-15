public class LongestCommonSubsequence {
    public static int lcs(String str1,String str2,int n,int m){
        if (n == 0 || m == 0){
            return 0;
        }
        //if string is Same
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1) + 1;
        }else{
            return Math.max(lcs(str1, str2, n-1, m),lcs(str1, str2, n, m-1));
        }
    }
    //using memoization technique
    public static int lcs2(String str1,String str2,int n,int m,int dp[][]){
        if (n == 0 || m == 0){
            return 0;
        }
        if (dp[n][m] != -1){  //already filled
            return dp[n][m];
        }
        //if string is Same
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = lcs2(str1, str2, n-1, m-1,dp) + 1;
            return dp[n][m];
        }else{
            dp[n][m] = Math.max(lcs2(str1, str2, n-1, m,dp),lcs2(str1, str2, n, m-1,dp));
            return dp[n][m];
        }
    }
    //using Tabulation
    public static int lca3(String str1,String str2,int n,int m){
        int dp[][] = new int[n+1][m+1];
        //initailization
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){   //no need in java
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static void print(int dp[][]){
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        //Recursion
        // System.out.println("The Length of longest Common Subsequence:"+lcs(str1, str2, str1.length(), str2.length()));
        
        //using memoization
        // int dp[][] = new int[str1.length()+1][str2.length()+1];
        // for (int i=0;i<dp.length;i++){
        //     for (int j=0;j<dp[0].length;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // System.out.println(lcs2(str1, str2, str1.length(), str2.length(), dp));
        // print(dp);

        System.out.println("Longest common Subsequence:"+lca3(str1, str2, str1.length(), str2.length()));
    }

}
