import java.util.*;
public class DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
        
    }
    public static int Diameter2(Node root){
        if (root == null){
            return 0;
        }
        int ldiam = Diameter2(root.left);
        int rdiam = Diameter2(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(Math.max(ldiam,rdiam),selfDiam);
    }
    static class Info{
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info Diameter(Node root){
        if (root == null){
            return new Info(0,0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int finalDiameter = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int finalHeight = Math.max(leftInfo.ht,rightInfo.ht) + 1;
        
        return new Info(finalDiameter,finalHeight);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        // System.out.println("Diameter of A Tree is:"+Diameter2(root));
        System.out.println("Diameter of a Tree is:"+Diameter(root).diam);
    }
}
