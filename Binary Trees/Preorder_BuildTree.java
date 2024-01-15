import java.util.*;
public class Preorder_BuildTree {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        //base case
        if (root == null){
            System.out.print("-1"+" ");//optional
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        //base case
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        //base case
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
               
            }
        }
    }
    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int myheight=Math.max(lh,rh) + 1;
        return myheight;
    }
    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        int mycount = lc+rc+1;
        return mycount;
    }
    public static int sumOfNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};//preorder

        BinaryTree Tree = new BinaryTree();
        Node root = Tree.buildTree(nodes);
        // System.out.println(root.data);

        // preorder(root);
        // inorder(root);
        // postorder(root);
        // levelOrder(root);
        // System.out.println(height(root));
        // System.out.println(count(root));
        System.out.println("Sum of Nodes is:"+sumOfNodes(root));
    }
}
                //Tree Taken as reference in above question
                //     1
                //    / \
                //   2    3
                //  / \    \
                // 4   5    6