import java.util.*;
public class binary_to_decimal {
    public static void bin_dec(int binary){
        int dec=0;
        for(int i=0;binary>0;i++){
            int lastdigit=binary%10;
            dec=dec+lastdigit*(int)(Math.pow(2,i));
            binary=binary/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number for a conversion from binary to decimal");
        int num=sc.nextInt();
        bin_dec(num);
        sc.close();
    }
    
}
