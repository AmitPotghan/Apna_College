import java.util.*;
public class LowestCommonAncestor {
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
    public static boolean getPath(Node root,int n,ArrayList<Node>path){
        if (root == null){
            return false;
        }
        path.add(root);
        if (root.data == n){
            return true;
        }
        boolean findleft=getPath(root.left, n, path);
        boolean findright=getPath(root.right, n, path);

        if (findleft || findright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static void lca(Node root,int n1,int n2){
        ArrayList<Node>path1=new ArrayList<>();
        ArrayList<Node>path2=new ArrayList<>();
        

        getPath(root,n1,path1);  //passing path 1 to get path 
        getPath(root,n2,path2);

        //lease common Ancestor
        int i=0;
        for (;i<path1.size() && i<path2.size();i++){
            if (path1.get(i) != path2.get(i)){
                break;
            }
        }
        //Ancestor i-1
        System.out.println("Lowest Common Ancestor is:"+path1.get(i-1).data);

    }
    public static Node lca2(Node root,int n1,int n2){
        if (root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca2(root.left,n1,n2);
        Node rightlca = lca2(root.right,n1,n2);

        if (rightlca == null){        //leftlca ->valid value and rightlca->null
            return leftlca;
        }
        if (leftlca == null){
            return rightlca;
        }
        return root;
    }

    public static int lcaDist(Node root,int n){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftdistance = lcaDist(root.left, n);
        int rightdistance = lcaDist(root.right, n);

        if (leftdistance == -1 && rightdistance == -1){
            return -1;
        }else if (leftdistance == -1){
            return rightdistance + 1;
        }else{
            return leftdistance + 1;
        }
    }
    public static int minDist(Node root,int n1,int n2){    //minimum distance between Nodes
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);       

        return dist1 + dist2;
    }
    public static int kthAncestor(Node root,int n,int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftd = kthAncestor(root.left, n, k);
        int rightd = kthAncestor(root.right, n, k);

        if (leftd == -1 && rightd == -1){
            return -1;
        }
        int max=Math.max(leftd,rightd);
        if (max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    public static int TransformToSumTree(Node root){
        if (root == null){
            return 0;
        }
        int leftChild=TransformToSumTree(root.left);
        int rightChild= TransformToSumTree(root.right);
        int data=root.data;

        int newleft = root.left == null ? 0:root.left.data;  //for leaf nodes condition
        int newright = root.right == null ? 0:root.right.data;

        root.data=leftChild + rightChild + newleft + newright;
        return data;
    }
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // lca(root,6,7);
        // System.out.println("Lowest common Ancestor is:"+lca2(root,4,7).data);

        // System.out.println(minDist(root, 4, 5));

        // kthAncestor(root, 5, 1);

        TransformToSumTree(root);
        preorder(root);
        


    }
}
