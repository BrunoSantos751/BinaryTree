public class Node {
    private Node left;
    private Node right;
    private float data;



    public Node(float data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public float getData() {
        return data;
    }

}

