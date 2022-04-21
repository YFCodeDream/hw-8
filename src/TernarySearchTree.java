public class TernarySearchTree {
    private Node root;

    TernarySearchTree() {
        Node node_1 = new Node(4, 6);
        Node node_2 = new Node(10, 20);
        Node node_3 = new Node(25, 75);
        Node node_4 = new Node(40, 60);
        Node node_5 = new Node(30, 35);
        Node node_6 = new Node(65, 70);
        Node node_7 = new Node(80, 90);
        Node node_8 = new Node(77, 79);
        Node node_9 = new Node(84, 86);
        Node node_10 = new Node(95, 97);

        root = node_3;
        root.left = node_2;
        root.left.left = node_1;

        root.mid = node_4;
        root.mid.left = node_5;
        root.mid.right = node_6;

        root.right = node_7;
        root.right.left = node_8;
        root.right.mid = node_9;
        root.right.right = node_10;
    }

    public void inOrder() {
        inOrderByRecursion(root);

    }

    private void inOrderByRecursion(Node node) {
        if (node != null) {
            inOrderByRecursion(node.left);
            System.out.println(node.small);
            System.out.println(node.large);
            inOrderByRecursion(node.mid);
            inOrderByRecursion(node.right);
        }
    }

    private class Node {
        int small;
        int large;
        Node left;
        Node mid;
        Node right;

        public Node(int small, int large) {
            this.small = small;
            this.large = large;
        }
    }
}
