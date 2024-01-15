public class EditDistance {
    public static int Edit_Distance(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][] = new int[n+1][m+1];
        //Initialization
        for (int i=0;i<m+1;i++){
            for (int j=0;j<m+1;j++){
                if (i==0){
                    dp[0][j] = j;
                }
                if (j == 0){
                    dp[i][j] = i;
                }
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){  //same
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{  //different
                    int add = dp[i][j-1] + 1;
                    int delete = dp[i-1][j] + 1;
                    int Replace = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(Math.min(add,delete),Replace);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1="intention";
        String str2="execution";
        System.out.println(Edit_Distance(str1, str2));
    }
}
