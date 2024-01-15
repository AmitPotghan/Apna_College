import java.util.*;
public class average {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter first/second/third number:");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("The average of three number is:"+(a+b+c)/3);

        sc.close();
        
    }
}
