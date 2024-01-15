import java.util.*;
public class queue_using2stack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        //Add operation 
        public static void add(int data){
            // step 1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //step 2
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Remove Operation
        public static int remove(){
            while(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            while(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String []args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
