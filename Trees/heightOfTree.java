package Trees;

public class heightOfTree {
    public static int calculateHeight(tree.Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }
    public static void main(String[] args) {
        Integer [] nodes = {1,2,4,5,null,null,null,6,null,null,3,7,null,8,null,null,null};
        tree.Node root = binaryTree.buildTree(nodes);
        int height = calculateHeight(root);
        levelOrder.display(root);
        System.out.println("height:"+height);
    }
}
