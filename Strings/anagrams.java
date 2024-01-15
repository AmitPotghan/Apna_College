/*Question 4 :Determine if 2 Strings are anagrams of each other.What are anagrams?
If two strings contain the same characters but in a different order,they can be said to be anagrams.
Consider race and care.In this case,race's characters can be formed into a study, or care's characters can be formed
into race.*/
import java.util.*;
public class anagrams {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length() == str2.length()){
            char array1[]=str1.toCharArray();
            char array2[]=str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean result=Arrays.equals(array1,array2);
            if (result==true){
                System.out.println("str1 and str2 Strings are anagrams");
            }else{
                System.out.println("str1 and str2 Strings are not  anagrams");
            }

        }else{
            System.out.println("str1 and str2 Strings are not  anagrams");
        }


    }
}
