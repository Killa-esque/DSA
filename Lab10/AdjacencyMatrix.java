import java.io.File;
import java.util.*;

public class AdjacencyMatrix {
    private int[][] adj;
    private int NumV, NumE;

    public AdjacencyMatrix(int vertices) {
        NumV = vertices;
        adj = new int[NumV][NumV];
    }

    public AdjacencyMatrix() {
        
    }

    public void setEgde(int vertexSource , int vertexDestination , int weight) {
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
    }
    public int getEgde(int vertexSource , int vertexDestination){
        try{
            return adj[vertexSource][vertexDestination];
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public void loadFromFile(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            NumV = sc.nextInt();
            adj = new int[NumV][NumV];
            for (int i = 0; i < NumV; i++) {
                for(int j = 0; j < NumV; j++) {
                    adj[i][j] = sc.nextInt();
                    if (adj[i][j] > 0) {
                        NumE++;
                    }
                }
            }
            NumE = NumE / 2;
            sc.close();
        } catch (Exception e) {
        }
    }
    
    public void printGraph(){
        for(int i = 0; i < NumV; i++){
            for(int j = 0;j < NumV; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getNumE() {
        return NumE;
    }

    public int getNumV() {
        return NumV;
    }

    public void enumerateNeighbors(int u) {
        for (int i = 0; i < NumV; i++) {
            if (adj[u][i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public boolean existEdge(int u, int v) {
        return adj[u][v] != 0;
    }

    public void BFS(int s){
        boolean visited[] = new boolean[NumV];
    
        Queue <Integer > queue = new LinkedList <Integer >();
    
        visited[s] = true;
        queue.add(s);
    
        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");
    
            for(int i = 0; i < NumV; i++){
                if(adj[x][i] != 0 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS_recur(int v, boolean[] visited){
        visited[v] = true;
    
        System.out.print(v + " ");
    
        for(int i = 0; i < NumV; i++){
            if(adj[v][i] != 0 && visited[i] == false){
                DFS_recur(i, visited);
            }
        }
    }
    
    public void DFS(int s) {
        boolean[] visited = new boolean[NumV];
        DFS_recur(s, visited);
    }

    public void Prim(int source) {
        boolean explored[] = new boolean[NumV];
        PriorityQueue<MyEdge> pq = new PriorityQueue<MyEdge>(new Comparator<MyEdge>() {
           @Override
           public int compare(MyEdge e1, MyEdge e2) {
            if (e1.w < e2.w) return -1;
            if (e1.w > e2.w) return 1;
            return 0;
           } 
        });
        LinkedList<MyEdge> T_edges = new LinkedList<>();

        explored[source] = true;

        for (int i = 0; i < NumV; i++) {
            if (adj[source][i] > 0) {
                pq.offer(new MyEdge(adj[source][i], source, i));
            }
        }

        while (! pq.isEmpty()) {
            MyEdge e = pq.poll();
            if (explored[e.v] == false) {
                explored[e.v] = true;
                T_edges.add(e);

                for (int i = 0; i < NumV; i++) {
                    if (adj[e.v][i] > 0 && explored[i] == false) {
                        pq.offer(new MyEdge(adj[e.v][i], e.v, i));
                    }
                }
            }
        }

        System.out.println("Prim's :" + T_edges);
    }

    public void KrusKal() {
        LinkedList<MyEdge> edges = new LinkedList<>();

        for(int i = 0; i < NumV; i++) {
            for (int j = 0; j < i; j++) {
                if (adj[i][j] > 0) edges.add(new MyEdge(adj[i][j], i, j));
            }
        }

        edges.sort(new Comparator<MyEdge>() {
            @Override
            public int compare(MyEdge e1, MyEdge e2) {
                if (e1.w < e2.w) return -1;
                if (e1.w > e2.w) return 1;
                return 0;
            }
        });

        LinkedList<MyEdge> mst = new LinkedList<>();
        UnionFind djs = new UnionFind(NumV);

        for (MyEdge e : edges) {
            if (! djs.isSameSet(e.u, e.v)) {
                mst.add(e);
                djs.unionSet(e.u, e.v);
            }
        }

        System.out.println("Kruskal's: " + mst);
    }




    public static void main(String[] args) {
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.loadFromFile("graphAM.txt");
        am.printGraph();
        am.KrusKal();
    }
}