import java.io.*;
import java.util.*;

class IntegerTriple {
    private Integer weight;
    private Integer source;
    private Integer dest;

    public IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }

    public Integer getWeight(){
        return weight;
    }

    public Integer getSource(){
        return source;
    }

    public Integer getDest(){
        return dest;
    }

    @Override
    public String toString(){
        return String.format("%d - %d : %d", source, dest, weight);
    }
    
}

public class EdgeList {
    private Vector <IntegerTriple> edges;

    public EdgeList(){
        edges = new Vector <IntegerTriple >();
    }

    public void addEdge(int w, int u, int v){
        edges.add(new IntegerTriple(w,u,v));
    }

    public void printGraph(){
        for(int i = 0; i < edges.size(); i++){
            System.out.println(edges.get(i));
        }
    }

    public void loadFromFile(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            int numE = sc.nextInt();
            int w, u, v;
            edges = new Vector<>();
            for (int i = 0; i < numE; i++) {
                w = sc.nextInt();
                u = sc.nextInt();
                v = sc.nextInt();
                addEdge(w, u, v);
            }
            sc.close();
        } catch (Exception e) {}
    }

    public int getNumE() {
        return edges.size();
    }

    public int getNumV() {
        ArrayList<Integer> listOfVertices = new ArrayList<Integer>();
        for (int i = 0; i < edges.size(); i++) {
            if (! listOfVertices.contains(edges.get(i).getDest())) {
                listOfVertices.add(edges.get(i).getDest());
            }

            if (! listOfVertices.contains(edges.get(i).getSource())) {
                listOfVertices.add(edges.get(i).getSource());
            }
        }

        return listOfVertices.size();
    }

    public void enumerateNeighbors(int u) {
        for (IntegerTriple edge : edges) {
            if (edge.getSource() == u) {
                System.out.print(edge.getDest() + " ");
            }

            if (edge.getDest() == u) {
                System.out.print(edge.getSource() + " ");
            }
        }
    }

    public boolean existEdge(int u, int v) {
        for (IntegerTriple edge : edges) {
            if (edge.getSource() == u && edge.getDest() == v) return true;
            if (edge.getDest() == u && edge.getSource() == v) return true; 
        } 

        return false;
    }

    public static void main(String[] args) {
        EdgeList l = new EdgeList();
        l.loadFromFile("_EL.txt");
        System.out.println(l.existEdge(1, 3));
    }
}
