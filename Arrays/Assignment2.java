/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1], ...,nums[n-1],
 nums[0],nums[1],   ...,   nums[k-1]] (0-indexed).For example, [0,1,2,4,5,6,7] might be rotated at pivot 
 index 3 and become [4,5,6,7,0,1,2].
 
 Given the array nums after the possible rotation and an integer target, 
 returnthe index oftarget if it is in nums, or -1   if it is not in nums.
 You must write an algorithm with O(log n) runtime complexity.*/
import java.util.*;
public class Assignment2 {
    public static void search(int nums[],int target){
        int min=minsearch(nums);
    }
    public static int minsearch(int nums[]){
        int start=0;
        int end=nums.length - 1;

        while(start<end){
            int mid=start + (end - start)/2;
            if (mid>0 && nums[mid-1]<nums[mid]){
                return mid;
            }else if(nums[start]<nums[mid] && nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Target for search:");
        int target=sc.nextInt();

        System.out.println("The Target is Present at index:"+binary_search(arr, target));
        sc.close();

    }
}
