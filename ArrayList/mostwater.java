public class mostwater {
    public static void most_water(int height[]){
        int ht,width;
        int maxwater=0;
        for (int i=0;i<height.length;i++){
            for (int j=i+1;j<height.length;j++){
                ht=Math.min(height[i],height[j]);
                width=j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater,currwater);
            }
        }
        System.out.print("maxwater can be stored is: "+maxwater);
        
    }
    
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        most_water(height);
    }
}

