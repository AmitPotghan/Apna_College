//Question1:Count how many times lower case vowel soccurred in a String entered by the user.
import java.util.*;
public class ass_qn1 {
    public static int count_lowercasevowel(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered A String:");
        String str=sc.nextLine();
        System.out.println("The No of Times LowerCase vowels appear in a String is:"+count_lowercasevowel(str));
        sc.close();
    }
}
