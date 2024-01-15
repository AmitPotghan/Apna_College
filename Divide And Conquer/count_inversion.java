public class count_inversion {
    public static int inversion(int nums[]){
        int count=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={5,5,5};
        System.out.println(inversion(arr));
    }
}
