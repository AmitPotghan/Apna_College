public class WildCardMathching {
    public static boolean isMatch(String str,String pattern){
        int n=str.length();
        int m=pattern.length();
        boolean dp[][] = new boolean[n+1][m+1];

        //initialization
        dp[0][0] = true;
        //when pattern=0 string can be ="a","ab"... so no match
        for (int i=1;i<n+1;i++){
            dp[i][0] = false;
        }
        // when string is zero and pattern can be any thing
        for (int j=1;j<m+1;j++){
            if (pattern.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (str.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if (pattern.charAt(j-1) == '*'){
                    //ignore case
                    boolean ans1 = dp[i][j-1];
                    //not ignore case
                    boolean ans2 = dp[i-1][j];

                    dp[i][j] = ans1 || ans2;
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(isMatch(str, pattern));


    }
}
