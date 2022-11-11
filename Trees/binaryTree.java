package Trees;

public class binaryTree{
    static int index = -1;
    public static tree.Node buildTree(Integer [] nodes){
        index++;
        if(index >= nodes.length){
            return null;
        }
        if(nodes[index] == null){
            return null;
        }
        tree.Node newNode = new tree.Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }
}
