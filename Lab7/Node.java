public class Node {
    Integer key;
    Node left, right;
    int height;

    public Node(Integer key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
        this.height = 0;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey (Integer key){
        this.key = key;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight (int height){
        this.height = height;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString(){
        return key.toString();
    }

    
}
