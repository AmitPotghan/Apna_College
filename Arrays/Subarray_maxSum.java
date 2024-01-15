public class Subarray_maxSum {
    public static void max_sum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;   //-infinity

        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for (int k=start;k<=end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if (currsum > maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The max Subarray sum is:"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        max_sum(numbers);

    }
}
