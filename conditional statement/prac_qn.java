import java.util.*;
public class prac_qn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number:");
        int number=sc.nextInt();

        String type=(number>0)?"Positive Number":"Negative Number";
        System.out.println(type);
        sc.close();
    }
}
