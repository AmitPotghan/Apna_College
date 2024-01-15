import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String str1,String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        HashMap <Character,Integer> hm = new HashMap<>();
        for (int i=0;i<str1.length();i++){
            hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i), 0)+1);
        }
        System.out.println(hm);
        for (int i=0;i<str2.length();i++){
            char ch= str2.charAt(i);
            if (hm.get(str2.charAt(i)) != null){
                if (hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        System.out.println(isAnagram(str1, str2));
    }
}
