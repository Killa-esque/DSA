public class MyEdge {
    int w, u, v;

    public MyEdge(int w, int u, int v) {
        this.w = w;
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString() {
        return String.format("(%d - %d: %d)", u, v, w);
    }    
}
