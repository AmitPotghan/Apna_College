import java.util.*;
public class lp_3reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered a NUmber:");
        
        int num=sc.nextInt();
        while(num>0){
            int a=num%10;
            System.out.print(a);
            num=num/10;

        }
        sc.close();

    }
}
