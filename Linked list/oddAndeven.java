public class oddAndeven {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public static void  segregateEvenOdd(){
        Node end=head;
        Node prev=null;
        Node curr=head;

        while(end!=null){
            end=end.next;
        }
        Node newend=end;
        while(curr.data % 2 != 0 && curr!=end){
            newend.next=curr;
        }
    }
    public static void main(String[] args) {
        addLast(8);
        addLast(12);
        addLast(10);
        addLast(5);
        addLast(4);
        addLast(1);
        addLast(6);
        print(head);
    }
}
