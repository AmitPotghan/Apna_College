public class diagonal_sum {
    public static void diagonalsum(int arr[][]){
        int sum=0;
        // for (int i=0;i<arr.length;i++){
        //     for (int j=0;j<arr[0].length;j++){
        //         if (i==j  || i+j==arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        

        for (int i=0;i<arr.length;i++){
            sum+=arr[i][i];                   //as for secondary diagonal i+j =n-1 so j=n-1-i
            sum+=arr[i][arr.length-1-i];
        }
        System.out.println("The Sum of Principal diagonal elements:"+sum);

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        diagonalsum(arr);
    }
}
