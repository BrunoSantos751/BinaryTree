import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public Tree(float data) {
        this.root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    public String add(float data){
        addNo(root, data);
        return "Node added succesfully";


    }
    private void addNo(Node node, float data){
        if (node.getData() <= data){
            if (node.getRight() == null){
                node.setRight(new Node(data));
            }
            else{
                addNo(node.getRight(),data);
            }
        }
        if (node.getData() > data){
            if (node.getLeft() == null){
                node.setLeft(new Node(data));
            }
            else {
                addNo(node.getLeft(),data);

            }

        }

    }

    public float[] InOrder(){
        List<Float> results = new ArrayList<>();
        InOrderMethod(root,results);
        float[] finalResults =  new float[results.size()];
        for (int i = 0; i < results.size(); i++) {
            finalResults[i] = results.get(i);
        }
        return finalResults;

    }

    private void InOrderMethod(Node node, List<Float> results){
        if (node != null){
            InOrderMethod(node.getLeft(),results);
            results.add(node.getData());
            InOrderMethod(node.getRight(),results);
        }
    }

    public float[] PreOrder() {
        List<Float> results = new ArrayList<>();
        PreOrderMethod(root, results);
        float[] finalResults = new float[results.size()];
        for (int i = 0; i < results.size(); i++) {
            finalResults[i] = results.get(i);
        }
        return finalResults;
    }

    private void PreOrderMethod(Node node, List<Float> results){
        if (node != null){
            results.add(node.getData());
            PreOrderMethod(node.getLeft(),results);
            PreOrderMethod(node.getRight(),results);
        }
    }

    public float[] PosOrder() {
        List<Float> results = new ArrayList<>();
        PosOrderMethod(root, results);
        float[] finalResults = new float[results.size()];
        for (int i = 0; i < results.size(); i++) {
            finalResults[i] = results.get(i);
        }
        return finalResults;
    }
    private void PosOrderMethod(Node node, List<Float> results){
        if (node != null){
            PosOrderMethod(node.getLeft(),results);
            PosOrderMethod(node.getRight(),results);
            results.add(node.getData());
        }
    }



}
