package introToProblemSolving.trees;

public class Main {

    public static void main(String[] args) {

        TreeNode node4 = new TreeNode(40 , null , null);
        TreeNode node3 = new TreeNode(30 , null , node4);
        TreeNode node2 = new TreeNode(20 , null , null);
        TreeNode node1 = new TreeNode(10, node2 , node3);

        preOrderTraversal(node1);
    }

    public static void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


}
