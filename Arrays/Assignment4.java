public class Assignment4 {
    public static int trappedrainwater(int height[]){
        //calculate leftMax and rightMax auxillary array
        int n=height.length;
        int width=1;

        int leftmax[]=new int [height.length];
        int rightmax[]=new int [height.length];

        leftmax[0]=height[0];
        for (int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int trapwater=0;
        for (int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater += (waterlevel - height[i]) * width;
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("The Trapped Rain water is:"+trappedrainwater(height));

    }
}
