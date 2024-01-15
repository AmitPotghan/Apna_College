import java.util.*;
public class DuplicateParenthesis{
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //CLOSING
            
            if (ch == ')'){
                int count=0;
                while(s.peek() != '('){   //trying to find an opening bracket
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;//duplicate
                }else{
                    s.pop();//To delete opening pair
                }
            }else{
                s.push(ch);
            }
            
        }
        return false;
    }
    public static void main(String []args){
        String str="((a+b)+(c+d))";
        String str2="((a+b))";
        System.out.println(isDuplicate(str2));
    }
}