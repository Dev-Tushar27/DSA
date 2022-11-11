package Trees;

public class diameter {
    //time complexity = O(N)
    static class TreeInfo{
        int h,d;
        TreeInfo(int ht, int dia){
            this.h = ht;
            this.d = dia;
        }
    }
    public static TreeInfo calcInfo(tree.Node root){
        if( root == null ){
            return new TreeInfo(0,0);
        }

        TreeInfo left = calcInfo(root.left);
        TreeInfo right = calcInfo(root.right);

        int dia1 = left.d;
        int dia2 = right.d;
        int dia3 = left.d + right.d +1;

        int mydia = Math.max(Math.max(dia1, dia2), dia3);
        int myheight = Math.max(left.h,right.h)+1;

        TreeInfo myInfo = new TreeInfo(myheight, mydia);
        return myInfo;
    }
    // time Complexity = O(N^2);
    // public static int calcInfoulateDia(tree.Node root){
    //     if(root == null){
    //         return 0;
    //     }

    //     int dia1 = heightOfTree.calcInfoulateHeight(root.left) + heightOfTree.calcInfoulateHeight(root.right);
    //     int dia2 =  calcInfoulateDia(root.left);
    //     int dia3 =  calcInfoulateDia(root.right);

    //     return Math.max(dia1, Math.max(dia2, dia3));
    // }
    public static void main(String[] args) {
        Integer [] nodes = {1,2,4,null,null,5,null,null,3,null,6,null,null};
        tree.Node root = binaryTree.buildTree(nodes);
        // int dia = calcInfoulateDia(root);
        TreeInfo myTree = calcInfo(root);
        levelOrder.display(root);
        System.out.println("Diameter:"+myTree.d);
    }
}
