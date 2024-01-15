import java.util.*;
public class product {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();

        int product=a*b;
        System.out.println("Product:"+product);
        sc.close();
    }
}
