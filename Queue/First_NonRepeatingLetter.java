import java.util.*;
public class First_NonRepeatingLetter {
    public static void PrintNonRepeating(String str){
        int freq[] = new int[26];//'a'-->'z'
        Queue<Character> q =new LinkedList<>();


        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            //two cases of while loop
            if (q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str="aabccxb";
        PrintNonRepeating(str);
    }
}
