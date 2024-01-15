import java.util.ArrayList;
public class S_ArrayList{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push or add data in stack
        public static void push(int data){
            list.add(data);
        }
        //pop or delete data in stack
        public static int pop(){
            //corner case
            if (isEmpty()){
                return -1;
            }
            if (list.size() == 0){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek or see top in the stack

        public static int peek(){
            //corner case
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack  s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}