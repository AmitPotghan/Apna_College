public class StringConversion {
    public static int LongestCommonSubsequence(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][] = new int[n+1][m+1];
        //initialization
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if (i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (str1.charAt(i-1) ==  str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void String_Conversion(String str1,String str2){
        int lca_len = LongestCommonSubsequence(str1, str2);
        int deleteOperation = str1.length() - lca_len;
        int addOperation = str2.length() - lca_len;
        System.out.println("No of delete operation:"+deleteOperation);
        System.out.println("No of Insert operation:"+addOperation);
        System.out.println("Total Operation:"+(deleteOperation + addOperation));
    }
    public static void main(String[] args) {
        String str1="pear";
        String str2="sea";
        String_Conversion(str1,str2);
    }
}
