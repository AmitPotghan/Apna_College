public class hw2 {
    public static void print(int arr[][]){
        int sum=0;                           //time complexity:big of n^2;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("The sum of second row is:"+sum);
    }
    //2nd Approach

    public static void print2(int arr[][]){
        int sum=0;
        for (int i=0;i<arr.length;i++){           //Time complexity is big of n
            sum+=arr[1][i];
        }
        System.out.println("The sum of second row is:"+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        //print(arr);
        print2(arr);
    }
}
