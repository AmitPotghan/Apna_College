public class TEST{
    public static int trappedrainwater(int height[]){
        //Calculate auxillary or helper arrays
        //That is left most and right most boundry arrays
        int n=height.length;
        int width=1;

        int leftMax[]=new int[height.length];
        int rightMax[]=new int [height.length];

        leftMax[0]=height[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int trapwater=0;
        for (int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trapwater+=(waterlevel - height[i]) * width;
        }
        return trapwater;
    }
    
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("The Trapped RainWater is :"+trappedrainwater(height));
    }
}
