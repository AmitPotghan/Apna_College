import java.util.*;
class practise{
    public static void TrapRainwater(int height[]){
        int n=height.length;
        Stack<Integer> S =new Stack<>();
        for (int i=0;i<n;i++){
            while(!S.isEmpty() && height[S.peek()] < height[i]){

            }
        }
        
    }
    public static void main(String[] args) {
        int height[]={7,0,4,2,5,0,6,4,0,6};

    }
}