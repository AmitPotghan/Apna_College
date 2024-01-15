import java.util.*;
public class PalindromeLL {
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            next=null;
        }
    }
    public static Node head;
    public static boolean isPalindrome(Node head){
        Stack<Character>s=new Stack<>();

        Node temp=head;
        StringBuilder str1=new StringBuilder();
        while(temp!=null){
            str1.append(temp.data);

            s.push(temp.data);
            temp=temp.next;
        }
        StringBuilder str2=new StringBuilder();
        while(!s.isEmpty()){
            char ch=s.pop();
            str2.append(ch);
        }
        if (str1.toString().equals(str2.toString())){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node head=new Node('A');
        head.next=new Node('B');
        head.next.next=new Node('K');
        head.next.next.next=new Node('B');
        head.next.next.next.next=new Node('A');

        System.out.println(isPalindrome(head));
        
    }
}
