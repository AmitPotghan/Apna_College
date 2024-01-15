import java.util.*;
public class array1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Physics:"+marks[0]);
        System.out.println("Maths:"+marks[1]);
        System.out.println("Chemistry:"+marks[2]);

        marks[2]=marks[2] +1;
        System.out.println("Maths"+marks[2]);

        System.out.println("Length of an array is"+marks.length);
        sc.close();
    }
}