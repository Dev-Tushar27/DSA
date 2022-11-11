package Trees;

public class preOrder {
    public static void print(tree.Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Integer [] nodes = {1,2,4,7,null,null,null,5,null,null,3,null,6,null,null};
        tree.Node root = binaryTree.buildTree(nodes);
        System.out.println("Pre-order Traversal");
        print(root);
    }
}
