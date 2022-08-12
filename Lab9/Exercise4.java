public class Exercise4 {
    public static void main(String[] args) {
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.loadFromFile("_AM3.txt");
        am.printGraph();
        System.out.println("BFS:");
        am.BFS(0);
        System.out.println("\nDFS:");
        am.DFS(0);
        System.out.println("\nDFS iteration:");
        am.DFS_iter(0);
        System.out.println("\n0 -> 5?");
        System.out.println(am.isReachable(0, 5));
    }
}
