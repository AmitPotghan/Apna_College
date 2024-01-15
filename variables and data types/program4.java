/*Enter cost of 3 items from the user(usingfloatdatatype)-apencil,apenandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.*;
public class program4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        float a,b,c;
        System.out.println("Enter cost of pencil,pen eraser:");

        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        
        float total=a+b+c;
        float gst=total*0.18f;

        float bill=total+gst;

        System.out.println("Total bill with gst is:"+bill);

        sc.close();
        
    }
}
