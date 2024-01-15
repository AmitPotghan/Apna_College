import java.util.*;
public class input {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your age");
        age=sc.nextInt();

        sc.nextLine();    //It's because when you enter a number then press Enter, sc.nextInt() 
                          //consumes only the number, not the "end of line"When sc.nextLine() executes,
                          // it consumes the "end of line" still in the buffer from the first input.

        System.out.println("Enter your name:");
        name=sc.nextLine();

        System.out.println("Age:"+age);
        System.out.println(name);

        sc.close();
        
    }
}
