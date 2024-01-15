public class majority_element_2{
    public static int majority_element(int nums[],int si,int ei){
        //Base case
        if (si == ei){
            return nums[si];
        } 
        //kaam
        int mid=si+(ei-si)/2;
        int left=majority_element(nums, si, mid);
        int right=majority_element(nums, mid+1, ei);

        //if two halves agree on majority element then return the winner
        if (left==right){
            return left;
        }

        //otherwise count majority element in individual halves
        int leftcount=countinrange(nums,left,si,ei);
        int rightcount=countinrange(nums,right,si,ei);
        
        return leftcount>rightcount? left:right;
    }
    public static int countinrange(int nums[],int num,int si,int ei){
        int count=0;
        for (int i=si;i<=ei;i++){
            if (nums[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,3,3,3,3,3};
        System.out.println(majority_element(nums,0,nums.length-1));
    }
}