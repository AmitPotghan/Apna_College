public class trapped_rainwater {
    public static int trappedrainwater(int height[]){
        int n=height.length;
        int width=1;

        //Calculate left and right most boundary
        int leftMax[]=new int[height.length];
        int rightMax[]=new int [height.length];
        
        leftMax[0]=height[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedwater=0;
        for (int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedwater+=(waterlevel-height[i])*width;

            
        }
        return trappedwater;
    }
    public static int trap(int[] height) {
        int leftmax=Integer.MIN_VALUE;
        int rightmax=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        int trappedWater=0;
        while(l<r){
            leftmax = Math.max(leftmax,height[l]);
            rightmax = Math.max(rightmax,height[r]);
            trappedWater += (leftmax < rightmax)? leftmax-height[l++]:rightmax-height[r--];
            System.out.println(trappedWater);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("The trapped Rain water is:"+trappedrainwater(height));

    }
}
