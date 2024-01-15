public class CoinChange {
    public static int Coin_Change(int coins[],int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        //Initialization
        for (int i=0;i<dp.length;i++){
            dp[i][0] = 1;
        }
        for (int j=1;j<dp[0].length;j++){
            dp[0][j] = 0;
        }
    
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (coins[i-1] <= j){
                    //include
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                    //coins i muliple times use karke kitne tarike he
                    //coins i nhi use karke bakike use karke kitne tarike he
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[n][sum];
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
        int coins[] = {2,5,3,6};
        int sum = 10;
        System.out.println("Total no of Ways:"+Coin_Change(coins,sum));
    }
}
