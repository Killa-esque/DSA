import java.util.*;
import java.io.File;

public class AdjacencyList{
    private int V; // No. of vertices
    private LinkedList <Integer > adj[];

    @SuppressWarnings("unchecked")
    public AdjacencyList(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
        adj[i] = new LinkedList <Integer >();
    }

    public AdjacencyList()
    {
    }

    public void addEdge(int u, int v)
    {
        adj[u].add(v);
    }

    public void loadFromFile(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            V = Integer.parseInt(sc.nextLine());
            
            adj = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<Integer>();
            }

            for (int i = 0; i < V; i++) {
                String line = sc.nextLine();
                String[] tmp = line.split(" ");

                LinkedList<Integer> list = adj[Integer.parseInt(tmp[0])];
                for (int j = 1; j < tmp.length; j++) {
                    list.add(Integer.parseInt(tmp[j]));
                }
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printGraph() {
        for(int i = 0; i < V; i++) {
            System.out.println(i+": " + adj[i]);
        }
    }

    public int getNumV() {
        return V;
    }

    public int getNumE() {
        int count = 0;
        for (LinkedList list: adj) {
            count += list.size();
        }
        return count/2;
    }

    public void enumerateNeighbors(int u) {
        for(int v: adj[u]) {
            System.out.println(v + ",");
        }
        System.out.println();
    }
    public boolean existEdge(int u, int v) {
        return adj[u].contains(v);
    }

    public static void main(String[] args) {
        AdjacencyList al = new AdjacencyList();
        al.loadFromFile("_AL.txt");
        al.printGraph();
    }
}