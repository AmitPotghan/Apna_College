import java.util.*;
public class NextGreater_Bruteforce{
    public static void main(String[] args) {
        int arr[]={6,8,9,1,3};
    
        int nxtGreater[]=new int[arr.length];
        
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for (int j=i+1;j<arr.length && flag==true;j++){
                if (arr[i]<arr[j]){
                    nxtGreater[i]=arr[j];
                    flag=false;
                }else{
                    nxtGreater[i]=-1;
                    flag=false;
                }
            }
            if (i==arr.length-1){
                nxtGreater[i]=-1;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    
    }
}