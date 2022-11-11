package Trees;

public class postOrder {
    public static void display(tree.Node root){
        if(root == null){
            return;
        }
        display(root.left);
        display(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Integer [] nodes = {1,2,4,7,null,null,null,5,null,null,3,null,6,null,null};
        tree.Node root = binaryTree.buildTree(nodes);
        System.out.println("Post-order Traversal");
        display(root);
    }
}
