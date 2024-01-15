import java.util.*;
public class area_squ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the side of square:");
        int side=sc.nextInt();
        System.out.println("Area of Square is:"+side*side);

        sc.close();
    }
}