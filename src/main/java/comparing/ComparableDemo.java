package comparing;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-29 05:37
 */
public class ComparableDemo {
    @Test
    public void test() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(1);
        binaryTree.add(0);
        binaryTree.add(9);
        binaryTree.add(6);
        binaryTree.add(8);
        System.out.println("结果:");
        binaryTree.print();
    }
}

class BinaryTree {
    class Node {
        private Comparable data;
        private Node left;
        private Node right;

        public void addNode(Node newNode) {
            if (newNode.data.compareTo(this.data) < 0) {
                // 左子树
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void printNode() {
            if (this.left != null) {
                this.left.printNode();
            }
            System.out.println(this.data + "\t");
            if (this.right != null) {
                this.right.printNode();
            }
        }
    }

    private Node root;

    public void add(Comparable data) {
        Node newNode = new Node();
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            root.addNode(newNode);
        }
    }

    public void print() {
        this.root.printNode();
    }
}
