import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        // String str=sc.next();      //when we enter a string with space then this create a problem.so ,in this case
        String str=sc.nextLine();      //we use nextLine() function
        System.out.println(str); 
        
        
        System.out.println("The length of string is:"+str.length());  
        //also we use + for concantenation

        System.out.println(str.charAt(0));
        
       
        sc.close();
    }
}
