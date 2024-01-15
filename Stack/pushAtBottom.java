import java.util.*;
public class pushAtBottom {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        //step 1
        int top=s.pop();

        //step 2
        PushAtBottom(s, data);

        //step 3
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s,4);
        System.out.println(s);
        s.push(5);
        PushAtBottom(s, 14);
        System.out.println(s);
        
    }
}
