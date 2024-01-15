import java.util.*;
public class N_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int even=0;
        int odd=0;
        System.out.println("Enter the value of N:");
        n=sc.nextInt();
        
        int arr[]=new int[n];

        System.out.println("enter the elements:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("No of even count is:"+even);
        System.out.println("No of odd count is:"+odd);
        sc.close();
    }
}
