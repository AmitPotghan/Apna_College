import java.util.*;

public class stack_usingqueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Push operation
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.poll());
                }
                top = q1.poll();
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.poll());
                }
                top = q2.poll();
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.poll();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.poll();
                    q1.add(top);
                }
            }
            return top;
        }  
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
