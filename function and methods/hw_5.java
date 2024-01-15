import java.util.*;
public class hw_5 {
    public static void sumofinteger(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum= sum + lastdigit;
            n=n/10;
        }
        System.out.println("The Sum of Integers are:"+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        sumofinteger(num);
        sc.close();
        
    }
}
