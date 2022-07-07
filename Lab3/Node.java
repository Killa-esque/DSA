public class Node<E> {
    private Node<E> nextNode;
    private E data;

    public Node (){
        this(null,null);
    }

    public Node(Node<E> node, E item){
        this.nextNode = node;
        this.data = item;
    }

    public E getData(){return this.data;}
    public void setData(E data){this.data = data;}
    public Node<E> getNext(){return this.nextNode;}
    public void setNext(Node<E> node){this.nextNode = node;}

    @Override
    public String toString(){
        return data.toString();
    }
}