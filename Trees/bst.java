package Trees;

public class bst {
    static tree.Node root = null;
    public static void buildBST(int val){
        tree.Node newNode = new tree.Node(val);

        if(root == null){
            root = newNode;
            return;
        }

        tree.Node temp = root;
        while(temp!=null){
            if(temp.left == null && newNode.data < temp.data){
                temp.left = newNode;
            }else if(temp.right == null && newNode.data > temp.data){
                temp.right = newNode;
            }

            if(newNode.data > temp.data){
                temp = temp.right;
            }else{
                temp = temp.left;
            }
        }
    }
    public static void main(String[] args) {
        buildBST(9);
        buildBST(2);
        buildBST(15);
        buildBST(8);
        buildBST(11);
        levelOrder.display(root);
    }

}
