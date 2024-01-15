public class IntersectionLL {
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
    public static void main(String[] args) {

        Node head1,head2;
        head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(6);
        head1.next.next.next.next=new Node(7);

        head2=new Node(4);
        head2.next=head1.next.next;
        
        Node a=getIntersection(head1,head2);
        System.out.println(a.data);
        
    }
    public static Node getIntersection(Node head1,Node head2){

        while(head2 != null){
            Node temp=head1;
            while(temp!=null){
                if (temp.data == head2.data){
                   // System.out.println("Intersecion Point is :"+temp1.data);
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        System.out.println("No intersection point");
        return null;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
