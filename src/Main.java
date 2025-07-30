import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(21);

        tree.add(22);
        tree.add(19);

        Node root = tree.getRoot();
        /*
        Node child = root.getLeft();
        System.out.println(child.getData());
        Node child2 = child.getLeft();
        System.out.println(child2.getData());
         */
        float [] result = tree.InOrder();
        System.out.println(Arrays.toString(result));
    }
}