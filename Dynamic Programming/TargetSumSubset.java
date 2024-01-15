public class TargetSumSubset {
    public static boolean targetSumSubset(int arr[],int sum){
        int n = arr.length;
        boolean dp[][] = new boolean [n+1][sum + 1];
        //initialization
        for (int i=0;i<dp.length;i++){
            //When Target Sum is equal to zero
            //then any no of item can follow these condition
            dp[i][0] = true;
        }
        //when no of item is zero then dp[0][i] = false; but no need as in java boolean array is initialize with false
        //exception when n=0 and targetsum=0 then true;


        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                int v = arr[i-1];
                //include
                if (v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                // exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(boolean dp[][]){
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //KnapSack Variation
        int arr[]={4,2,7,1,3};
        int sum = 10;
        System.out.println(targetSumSubset(arr, sum));
    }
}
