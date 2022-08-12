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
                System.out.println(i + ",");
            }
        }
        System.out.println();
    }
    public boolean existEdge(int u, int v) {
        return adj[u][v] > 0;
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
    
    public void DFS(int s){
        boolean[] visited = new boolean[NumV];
        DFS_recur(s, visited);
    }

    public void DFS_iter(int s) {
        boolean visited[] = new boolean[NumV];
        Stack<Integer> stack = new Stack<>();

        visited[s] = true;
        stack.add(s);
        System.out.println(s + " ");

        while(!stack.isEmpty()) {
            int x = stack.peek();

            boolean check = false;
            for (int i = 0; i < NumV; i++ ) {
                if (adj[x][i] != 0 && visited[i] == false) {
                    stack.add(i);
                    visited[i] = true;
                    check = true;
                    System.out.print(i + " ");
                    break;
                }
            }

            if (check == false) {
                stack.pop();
            }
        }
    }

    boolean isReachable(int s, int d)
    {
        if (adj[s][d] == 1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        AdjacencyMatrix am = new AdjacencyMatrix();
        am.loadFromFile("_AM.txt");
        am.printGraph();
    }
}