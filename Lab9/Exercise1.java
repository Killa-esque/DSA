public class Exercise1 {
    public static void main(String[] args) {
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.loadFromFile("_AM.txt");
        am.printGraph(); //a
        System.out.println(am.getNumV()); //b
        System.out.println(am.getNumE()); //c
        am.enumerateNeighbors(0);
        am.enumerateNeighbors(4);
        System.out.println(am.existEdge(0, 1));
        System.out.println(am.existEdge(0, 6));
    }
}
