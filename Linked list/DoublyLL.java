public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head = newNode;

    }
    public int removeFirst(){
        if (head==null){
            System.out.println("doubly Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int del=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return del;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public int removeLast(){
        if (head==null){
            System.out.println("doubly Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            size--;
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node temp=head;
        int val=tail.data;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoublyLL ll=new DoublyLL();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();


    }
}
