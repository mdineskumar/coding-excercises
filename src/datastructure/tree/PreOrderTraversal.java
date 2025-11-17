package datastructure.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PreOrderTraversal {
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
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;

    }

    public static void preorder(TreeNode root, List<Integer> res){
        if(root == null) return;

        res.add(root.data);
        preorder(root.left,res);
        preorder(root.right,res);

    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if(root == null) return;

        //print left
        inorder(root.left,res);

        //print root
        res.add(root.data);

        //print right
        inorder(root.right,res);

    }

    public static List<Integer> postTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }

    public static void postorder(TreeNode root, List<Integer> res) {
        if(root == null) return;

        //print left
        postorder(root.left,res);
        //print right
        postorder(root.right,res);

        //print root
        res.add(root.data);

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

        List<Integer> lists = preorderTraversal(root);
        List<Integer> inorder_list = inorderTraversal(root);
        List<Integer> postorder_list = postTraversal(root);

        System.out.println(Arrays.toString(lists.toArray()));
        System.out.println(Arrays.toString(inorder_list.toArray()));
        System.out.println(Arrays.toString(postorder_list.toArray()));


    }
}
