public class IntNode {
    private IntNode nextNode;
    private int data;

    public IntNode (){
        this(null,0);
    }

    public IntNode(IntNode node, int item){
        this.nextNode = node;
        this.data = item;
    }

    public int getData(){return this.data;}
    public void setData(int data){this.data = data;}
    public IntNode getNext(){return this.nextNode;}
    public void setNext(IntNode node){this.nextNode = node;}

    @Override
    public String toString(){
        return String.valueOf(this.data);
    }
}