package datastructure.tree;

import java.util.*;

public class LevelOrder {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null) return res;

        q.offer(root);

        while(!q.isEmpty()) {
            int len = q.size();
            List<Integer> subres = new LinkedList<>();
            for(int i = 0; i < len;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);

                subres.add(q.poll().data);
            }
            res.add(subres);
        }
        return res;
    }

    public static TreeNode buildTree(TreeNode root){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the data: ");
        int data = scn.nextInt();
        root = new TreeNode(data);
        if(data == -1) {
            return  null;
        }
        System.out.println("enter data for inserting in left "+data);
        root.left = buildTree(root.left);
        System.out.println("enter data for inserting in right "+data);
        root.right = buildTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left_1_1 = new TreeNode(2);
        left_1_1.left = new TreeNode(4);
        left_1_1.right = new TreeNode(5);
        TreeNode right_1_1 = new TreeNode(3);
        right_1_1.left = new TreeNode(6);
        right_1_1.right= new TreeNode(7);
        root.left = left_1_1;
        root.right = right_1_1;

        List<List<Integer>> lists = levelOrder(root);

        System.out.println(Arrays.toString(lists.toArray()));


    }
}
