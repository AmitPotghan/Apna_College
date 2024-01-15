// Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
//  Use a recursive function to solve this problem.NOTE-The digits of the number will only be in the range  0-9 and 
//  the lastdigit of a number can’t be 0

public class convert_into_string_ass {
    public static void Number_to_String(int n){
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if (n==0){
            return;
        }
        int lastdigit=n%10;
        n=n/10;
        Number_to_String(n);
        System.out.print(arr[lastdigit]+" ");
    }
    public static void main(String[] args) {
        Number_to_String(1947);

    }
}
