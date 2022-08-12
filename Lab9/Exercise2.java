public class Exercise2 {
    public static void main(String[] args) {
        AdjacencyList al = new AdjacencyList();
        al.loadFromFile("_AL.txt");
        al.printGraph(); //a
        System.out.println(al.getNumV()); //b
        System.out.println(al.getNumE()); //c
        al.enumerateNeighbors(0);
        al.enumerateNeighbors(4);
        System.out.println(al.existEdge(0, 1));
        System.out.println(al.existEdge(0, 6));
    }
}
