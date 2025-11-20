package leetcode.trees;

import java.util.Scanner;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }


    }

    static Node buildTree(Node root) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the data: ");

        int data = scn.nextInt();
        root = new Node(data);

        if(data == -1){
            return null;
        }


        System.out.println("Enter data for inserting left "+data);
        root.left = buildTree(root.left);
        System.out.println("Enter data for inserting right "+data);
        root.right= buildTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = null;
        tree.buildTree(root);
    }
}
