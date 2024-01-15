public class Practise {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        
        Node newNode =new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if (head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if (idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeLast(){
        if (size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            int val=tail.data;
            size--;
            head=tail=null;
            return val;
        }
        Node temp=head;
        int val=temp.data;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    public int removeFirst(){
        if (size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            int val=tail.data;
            size--;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if (key == temp.data){
                return i;
            }else{
                temp=temp.next;
                i++;
            }
        }
        return -1;
    }
    public int helper(int key,int i,Node head){
        if (head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        if (head.data==key){
            return i;
        }
        return helper(key,i+1,head.next);
    }
    public int recSearch(int key){
        return helper(key,0,head);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromEnd(int n){
        //step 1- find size
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if (sz==n){
            head=head.next;
            return;
        }
        Node prev=head;
        for (int i=1;i<sz-n;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
    }
    public Node findMid(Node head){
        //using slow fast concept
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public boolean checkpalindrome(){
        if (head==null || head.next==null){
            return true;
        }
        Node mid=findMid(head);

        //Now reverse second half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;  //due to reverse
        while(right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                cycle=true;
                break;
            }
        }
        if (cycle== false){
            return;
        }
        slow=head;
        Node prev=null;
        while(fast!=slow){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String args[]){
        Practise ll=new Practise();
        ll.addFirst(4);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(5);
        
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head.next;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

        
    }
}
