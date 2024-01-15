import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float rad;
        float area;

        System.out.println("Enter the radius of Circle:");
        rad=sc.nextFloat();
        area=3.14f * rad * rad;
        System.out.println("Area of Circle:"+area);
        sc.close();

    }
}
