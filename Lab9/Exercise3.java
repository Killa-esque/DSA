public class Exercise3 {
    public static void main(String[] args) {
        EdgeList el = new EdgeList();
        el.loadFromFile("_EL.txt");
        el.printGraph(); //a
        System.out.println(el.getNumV()); //b
        System.out.println(el.getNumE()); //c
        el.enumerateNeighbors(0);
        el.enumerateNeighbors(4);
        System.out.println(el.existEdge(0, 1));
        System.out.println(el.existEdge(0, 6));
    }
}
