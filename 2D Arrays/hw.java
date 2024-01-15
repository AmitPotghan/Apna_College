//Print the number of 7’s that are inthe 2d array
public class hw{
    public static void count(int arr[][]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("The no of times 7's Appear is:"+count);
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        count(arr);
    }
}