//half pending
public class swappedLL {
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

    public static void SwappedLinkedL(int x,int y,Node head){
        if (x==y){
            return;
        }
        Node temp=head;
        Node newNode=new Node(y);
        Node prev=null;
        while(temp.data != x){
            prev=temp;
            temp=temp.next;
        }
        newNode.next=temp.next;
        prev.next=newNode;

        Node back=null;
        newNode=newNode.next;
        Node newNode2=new Node(x);
        while(newNode.data != y){
            back=newNode;
            newNode=newNode.next;
        }
        newNode2.next=newNode.next;
        back.next=newNode2;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        
        int x=2,y=5;
        print(head);
        SwappedLinkedL(x,y,head);
        print(head);
    }
}
