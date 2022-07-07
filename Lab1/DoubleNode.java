public class DoubleNode {
    private DoubleNode nextNode;
    private double data;

    public DoubleNode (){
        this(null,0.0);
    }

    public DoubleNode (DoubleNode node, double item){
        this.nextNode = node;
        this.data = item;
    }

    public double getData(){return this.data;}
    public void setData(double data){this.data = data;}
    public DoubleNode getNext(){return this.nextNode;}
    public void setNext(DoubleNode node){this.nextNode = node;}

    @Override
    public String toString(){
        return String.valueOf(data);
    }
} 