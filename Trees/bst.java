package Trees;

public class bst {
    public static tree.Node insert(tree.Node root,tree.Node newNode){
        
        if (root == null){
            root = newNode;
        }
        else if(root.data> newNode.data){
            root.left = insert(root.left,newNode);
        }
        else if(root.data < newNode.data){
            root.right = insert(root.right,newNode);
        }
        return root;
    }
    public static boolean search(tree.Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }else if(root.data < val){
            return search(root.right, val);
        }else{
            return search(root.left, val);
        }
    }
    public static tree.Node minValue(tree.Node root){
        tree.Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
    public static tree.Node delete(tree.Node root, int val){
        if(root == null){
            return root;
        }
        if(root.data< val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left,val);
        }else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            tree.Node min = minValue(root.right);
            root.data = min.data;
            root.right = delete(root.right, min.data);
        }
        return root;
    }
    public static void main(String[] args) {
        tree.Node root = null;
        int [] arr = {9,5,10,2,13};
        for (int i = 0; i < 5; i++) {
            tree.Node newNode = new tree.Node(arr[i]);
            root = insert(root, newNode);
        }
        levelOrder.display(root);
        System.out.print("Inorder traversal:");
        inOrder.display(root);
        if(search(root, 13)){
            System.out.println("\nElement found!!!!");
        }else{
            System.out.println("\nElement not found!!!!");
        }
        System.out.println("-------Deleting 10-------");
        delete(root, 10);
        levelOrder.display(root);
    }

}
