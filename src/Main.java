public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(21);

        tree.add(20);
        tree.add(19);

        Node root = tree.getRoot();
        Node child = root.getLeft();
        System.out.println(child.getData());
        Node child2 = child.getLeft();
        System.out.println(child2.getData());
    }
}