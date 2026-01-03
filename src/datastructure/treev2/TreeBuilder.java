package datastructure.treev2;

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;




}
public class TreeBuilder {

    public Node buildTree(Node root) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for node");
        int val = scanner.nextInt();

        root = new Node();
        root.val= val;

        if(val == -1) {
            return null;
        }

        System.out.println("Build tree for left");
        root.left = buildTree(root.left);

        System.out.println("Build tree for right");
        root.right = buildTree(root.right);

        return root;
    }


    public static void main(String[] args) {
        Node root = null;

        TreeBuilder treeBuilder = new TreeBuilder();
        Node rootv2 = treeBuilder.buildTree(root);


    }






}
