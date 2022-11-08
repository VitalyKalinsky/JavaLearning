package vitaly.learning.dataStructures;

public class BinaryTree {
    private Node root = null;

    public boolean isEmpty() {
        return root == null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if (current == null)
                return null;
        }
        return current;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (isEmpty())
            root = node;

        else {
            Node current = root,
                    parent;

            while (true) {
                parent = current;
                if (value < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void insert(int[] values) {
        for (int el : values)
            insert(el);
    }

    public void inOrder() {
        recInOrder(root);
        System.out.println();
    }

    private void recInOrder(Node current) {
        if (current != null) {
            recInOrder(current.leftChild);
            System.out.print(current.iData + " ");
            recInOrder(current.rightChild);
        }
    }

    public void preOrder() {
        recPreOrder(root);
        System.out.println();
    }

    private void recPreOrder(Node current) {
        if (current != null) {
            System.out.print(current.iData + " ");
            recPreOrder(current.leftChild);
            recPreOrder(current.rightChild);
        }
    }

    public void postOrder() {
        recPostOrder(root);
        System.out.println();
    }

    private void recPostOrder(Node current) {
        if (current != null) {
            recPostOrder(current.leftChild);
            recPostOrder(current.rightChild);
            System.out.print(current.iData + " ");
        }
    }

    public Node minimum() {
        Node current = root;
        if (isEmpty())
            return null;
        while (current.leftChild != null)
            current = current.leftChild;
        return current;
    }

    public Node maximum() {
        Node current = root;
        if (isEmpty())
            return null;
        while (current.rightChild != null)
            current = current.rightChild;
        return current;
    }

    public boolean delete(int key) {
        if (isEmpty())
            return false;
        Node current = root,
                previous = root;
        boolean isLeft = false;
        while (current.iData != key) {
            previous = current;
            if (key < current.iData) {
                isLeft = true;
                current = current.leftChild;
            } else {
                isLeft = false;
                current = current.rightChild;
            }
            if (current == null)
                return false;
        }

        if (current == root)
            root = null;

        if (current.leftChild == null && current.rightChild == null) {
            if (isLeft)
                previous.leftChild = null;
            else
                previous.rightChild = null;

        } else if (current.leftChild == null) { //so rightChild != null
            if (isLeft)
                previous.leftChild = current.rightChild;
            else
                previous.rightChild = current.rightChild;

        } else if (current.rightChild == null) {//so leftChild != null
            if (isLeft)
                previous.leftChild = current.leftChild;
            else
                previous.rightChild = current.leftChild;
        } else {
            Node successor = getSuccessor(current);
            if (successor == root)
                root = successor;
            else if (isLeft) {
                previous.leftChild = successor;
            } else {
                previous.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return false;
    }

    public Node getSuccessor(Node delNode) {
        Node previous = delNode,
                successor = delNode,
                current = successor.rightChild;
        while (current != null) {
            previous = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != delNode.rightChild) {
            previous.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }

        return successor;
    }
}
