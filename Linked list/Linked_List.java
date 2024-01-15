public class Linked_List{
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
        //step 1:-creating new node
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }

        //step 2= newNode.next=head;
        newNode.next=head;//link

        //step 3= head=newNode;
        head=newNode;

    }

    public void addLast(int data){
        //step 1= creating a new node
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        //step 2 = tail.next=newNode
        tail.next=newNode;

        //step 3= tail=newNode
        tail=newNode;
    }
    public void print(){
        if (head==null){
            System.out.print("Linked list is empty");
            return;
        }

        //step 1 = creating temp Node to traverse and assigning it as head
        Node temp=head;
        
        //step 2= traverse LL till my temp!=null
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
        //step 1 - Creating a new node
        Node newNode=new Node(data);
        size++;
        
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1  temp-prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        
        if (size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val=head.data;
            tail=head=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1){
            size--;
            int val=tail.data;
            tail=head=null;
            return val;
        }
        
        Node temp=head;
        int val=tail.data;
        while(temp.next!=tail){         //also use for loop for 0 to less than size-2
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if (temp.data == key){
                return i;
            }else{
                temp=temp.next;
                i++;
            }
        }
        //key not found
        return -1;
    }
    public int helper(int key,int i,Node head){
        if (head==null){
            return -1;
        }
        if (head.data == key){
            return i;
        }
        return helper(key,i+1,head.next);
    }
    public int recSearch(int key){
        return helper(key, 0, head);
    }
    public void reverse(){
        //intialize 3 variables and do 4 step repetedly
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
        // if (head==null){
        //     System.out.println("LL is empty");
        // }
        // Node temp=head;
        // if (n==sz){
        //     head=head.next;
        //     return;
        // }
        // for (int i=0;i<size-n-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        //size--;
        // System.out.println(temp.data);

        //step-1 calculate size of LL
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
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow; //as slow is my mid in both cases even and odd
    }
    public boolean checkPalindrome(){
        if (head==null || head.next==null){
            return true;
        }
        // find middle
        Node mid=findMid(head);

        //reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //check if equal
        while(right!=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCycle(){  //floy'd cycle finding algorithm
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
            if (slow == fast){
                return true;  //cycle exist
            }
        }
        return false;  //cycle doesn't exist
    }
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                cycle=true;
                break;
            }
        }
        if (cycle == false){
            return;
        }

        //find meeting point

        slow=head;
        Node prev=null;
        while(fast!=slow){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        
        //remove cycle  last.next=null
        prev.next=null;
    }
    private Node getMid(Node head){
        if (head==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1!=null && head2!=null){
            if (head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 != null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if (head==null || head.next==null){
            return head;
        }
        //getting mid
        Node mid=getMid(head);
        Node righthead=mid.next;
        mid.next=null;

        //calling rec mergesort for both half
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(righthead);

        return merge(newLeft,newRight);

    }
    public void zigZag(){
        //step 1: find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //step 2: reverse second half
        
        Node prev=null;
        Node curr=mid.next;
        Node next;

        mid.next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL , nextR;

        //step 3: alternate zigZag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        Linked_List ll=new Linked_List();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(0);
        ll.print();
        
        // //for cycle detection only
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head.next;
        // //1-2-3-2
        // System.out.println(isCycle());
        
        // removeCycle();
        // System.out.println(isCycle());
        // //print();
        

        //MergeSort();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();

        ll.zigZag();
        ll.print();
    }
}