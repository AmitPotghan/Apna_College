public class S_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;

        public static boolean isempty(){
            return head == null;
        }
        //push operation
        public static void push(int data){
            Node newNode=new Node(data);
            //corner case
            if (head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop operation
        public static int pop(){
            int top=head.data;
            //corner case
            if (head==null){
                return -1;
            }
            head=head.next;
            return top;
        }
        public static int peek(){
            if (head==null){
                return -1;
            }
            return head.data;
        }
        public static void print(){
            Node temp=head;
            if (head==null){      //can also use isempty function
                System.out.println("Can't print Stack is empty");
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.print();
        st.pop();
        
        st.print();

    }
}
