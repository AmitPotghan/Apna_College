import java.util.*;
public class income_tax {
    public static void main(String[] args) {
        int income;
        int tax;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter your Income:");
        income=sc.nextInt();

        if (income<500000){
            tax=0;
        }
        else if(income >=500000  && income<1000000){
            tax=(int)(income *0.20);
        }
        else {
            tax= (int)(income * 0.30);
        }
        System.out.println("Your Tax is:"+tax);
        sc.close();
    }
    
}
