package Trees;

public class subTree {
    public static boolean isIdentical(tree.Node root1, tree.Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data == root2.data){
            return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        }

        return false;
    }

    public static boolean isSubTree(tree.Node root, tree.Node subRoot){
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

    }

    
    // public static void main(String[] args) {
    //     Integer [] tree1 = {1,2,3,null,null,5,null,null,6,7,null,null,8,null,null};
    //     tree.Node root1 = binaryTree.buildTree(tree1);
    //     // levelOrder.display(root1);
    //     // System.out.println();
    //     Integer [] tree2 = {6,9,null,null,8,null,null};
    //     tree.Node root2 = binaryTree.buildTree(tree2);
    //     // levelOrder.display(root2);
    //     // System.out.println();

    //     if(isSubTree(root1, root2)){
    //         System.out.println("True");
    //     }else{
    //         System.out.println("False");
    //     }
    // }
}
