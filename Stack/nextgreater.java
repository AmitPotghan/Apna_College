import java.util.*;
public class nextgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nxtGreater[] = new int[arr.length];
        
        for (int i=arr.length-1;i>=0;i--){
            //step 1
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //step 2 check if stack is empty
            if (s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }
            //step 3
            s.push(i);
        }
        
        for (int i=0;i<arr.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
