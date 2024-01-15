public class MinPartition {
    public static int minPartition(int arr[]){
        //calculating sum of  array
        int n = arr.length;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int W=sum/2;
        //0-1 knapSack
        int dp[][] =  new int[arr.length+1][W+1];

        //intialization
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for (int i=1;i<dp.length;i++){
            for (int j=1;j<dp[0].length;j++){
                if (arr[i-1] <= j){ //include
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        int set1Sum = dp[n][W];
        int set2Sum = sum - set1Sum;
        return Math.abs(set1Sum - set2Sum);
    }
    public static void print(int dp[][]){
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,6,11,5};
        System.out.println(minPartition(arr));

    }
}