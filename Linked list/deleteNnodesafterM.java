public class deleteNnodesafterM {
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

    public static void delete(int m,int n,Node head){
        Node curr=head;
        int count;
        while(curr!=null){
            for (count=1;count<m && curr!=null;count++){
                curr=curr.next;
            }
            if (curr == null){
                return;
            }
            Node t=curr.next;
            for (count=1;count<=n && t!=null;count++){
                t=t.next;
            }
            curr.next=t;
            curr = t;
        }
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(1);

        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);

        int M=1;
        int N=2;
        print(head);
        delete(M, N, head);
        print(head);

    }
}
