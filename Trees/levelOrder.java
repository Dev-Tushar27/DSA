package Trees;
import java.util.LinkedList;
import java.util.Queue;
public class levelOrder {
    public static void display(tree.Node root){
        if(root == null){
            System.out.println("Error");
            return;
        }
        Queue<tree.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            tree.Node curr = q.remove();
            if(curr == null){
                System.out.println();;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+"\t");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer [] nodes = {1,2,4,7,null,null,null,5,8,null,null,null,3,null,6,null,null};
        tree.Node root = binaryTree.buildTree(nodes);
        display(root);
    }
}
