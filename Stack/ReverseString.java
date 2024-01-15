import java.util.*;
public class ReverseString {
    public static void reverseString(String str){
        Stack <Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.peek();
            result.append(curr);
            s.pop();
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="Amit";
        reverseString(str);
    }
}
