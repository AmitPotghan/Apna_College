import java.util.*;
public class Calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char operator;
        int a,b;
        System.out.println("Enter an operator:(+,-,*,/)");
        operator=sc.next().charAt(0);
        System.out.println("Enter first Number:");
        a=sc.nextInt();
        System.out.println("Enter Second Number:");
        b=sc.nextInt();
        
        switch(operator){
            case '+':
            System.out.println("Addition of two Numbers is:"+(a+b));
            break;

            case '-':
            System.out.println("Substraction of two Numbers is:"+(a-b));
            break;

            case '*':
            System.out.println("Multiplication of two Numbers is:"+(a*b));
            break;

            case '/':
            System.out.println("Division of two Numbers is:"+(a/b));
            break;
            
            default:
            System.out.println("Invalid input ");
        }
        sc.close();
    }
}
