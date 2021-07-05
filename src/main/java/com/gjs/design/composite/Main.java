package com.gjs.design.composite;

public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        Node c21 = new LeafNode("c21");
        Node c22 = new LeafNode("c22");

        chapter1.add(c11).add(c12);
        chapter2.add(c21).add(c22);

        root.add(chapter1).add(chapter2);

        tree(root, 0);

    }

    public static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("++");
        }
        node.printName();

        if (node instanceof BranchNode) {
            for (Node node1 : ((BranchNode) node).list) {
                tree(node1, depth + 1);
            }
        }
    }
}
