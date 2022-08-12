import java.util.*;

public class Exercise {
    public static void Prim(AdjacencyMatrix am, int numV) {
        int INF = Integer.MAX_VALUE;
        boolean[] visited = new boolean[numV];

        
        
    }

    public static void main(String[] args) {
        String filename ="graphAM.txt";
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.loadFromFile(filename);
        Prim(am, am.getNumV());
    }
}
