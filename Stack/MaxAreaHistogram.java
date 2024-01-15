import java.util.*;
public class MaxAreaHistogram {
    
    public static void MaxArea(int arr[]){
        int MaxArea=0;
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        //next Smaller left
        Stack<Integer>s=new Stack<>();

        for (int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();   //here we don't want actual value instead we store index
            }
            s.push(i);
        }

        //Calculate next Smaller right
        s=new Stack<>();

        for (int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i]=arr.length;  //not -1 bcoz to Calculate accurate result
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Calculating Area according to each histogram
        for (int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int CurrArea=height * width;
            MaxArea=Math.max(MaxArea,CurrArea);
        }
        System.out.println("Maximum Area is:"+MaxArea);
    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        MaxArea(height);
        

        
    }
}
