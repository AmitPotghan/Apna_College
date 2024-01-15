import java.util.*;
public class lp_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter a Number:");
            n=sc.nextInt();

            if (n%10 == 0){
                continue;
            }
            System.out.println("Entered Number:"+n);
        }
        
        
    }
}
