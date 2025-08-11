import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(21);

        tree.add(22);
        tree.add(19);
        tree.add(23);
        tree.add(15);
        tree.add(14);
        tree.add(10);
        tree.add(9);
        tree.add(30);
        tree.add(20);

        float [] resultInOnrder = tree.InOrder();
        float [] resultPreOrder = tree.PreOrder();
        float [] resultPosOrder = tree.PosOrder();
        System.out.println(Arrays.toString(resultInOnrder));
        System.out.println(Arrays.toString(resultPreOrder));
        System.out.println(Arrays.toString(resultPosOrder));
        System.out.println("----------------------------------------------------------------");
        tree.TreeView();
    }
}