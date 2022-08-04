public class AVL {
    private Node root;

    public AVL () {
        root = null;
    }
    //PRIVATE STUFFS
    private int height (Node x){
        if (x == null) return -1;
        return 1 + Math.max (height(x.getLeft()), height(x.getRight()));
    }

    private int balanceFactor (Node x){
        return height(x.getLeft()) - height(x.getRight());
    }

    private Node rotateLeft(Node x){
        Node y = x.getRight();
        x.setRight(y.getLeft());
        y.setLeft(x);
        x.setHeight(height(x));
        y.setHeight(height(y));
        return y;
    }

    private Node rotateRight(Node x){
        Node y = x.getLeft();
        x.setLeft(y.getRight());
        y.setRight(x);
        x.setHeight(height(x));
        y.setHeight(height(y));
        return y;
    }

    private Node balancing(Node x){
        if (balanceFactor(x) < -1){
            if (balanceFactor(x.getRight()) > 0){
                x.setRight(rotateRight(x.getRight()));
            }
            x = rotateLeft(x);
        }
        else if (balanceFactor(x) > 1){
            if (balanceFactor(x.getLeft()) < 0){
                x.setLeft(rotateLeft(x.getLeft()));
            }
            x = rotateRight(x);
        }
        return x;
    }

    private Node add(Node node, Integer key){
        if (node == null){
            return new Node(key,null,null);
        }
        else {
            if (key < node.getKey()){
                node.setLeft(add(node.getLeft(),key));
            }
            else {
                node.setRight(add(node.getRight(),key));
            }
        }
        return balancing(node);
    }

    private Node remove (Node node, Integer key) {
        if (node == null){
            return null;
        }
        else if (key < node.getKey()){
            node.setLeft(remove(node.getLeft(),key));
        }
        else if (key > node.getKey()){
            node.setRight(remove(node.getRight(),key));
        }
        else {
            if (node.getLeft() == null){
                Node right = node.getRight();
                node.setKey(null);
                node = null;
                return right;
            }
            else if (node.getRight() == null){
                Node left = node.getLeft();
                node.setKey(null);
                node = null;
                return left;
            }
            else {
                Integer tmp = leftMostOfRight(node.getRight());
                node.setKey(tmp);
                node.setRight(remove(node.getRight(), tmp));
            }
        }
        return balancing(node);
    }

    private Integer leftMostOfRight(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getKey();
    }
    private boolean contains(Node node, Integer key) {
        if (node == null){
            return false;
        }
        if (node.getKey() > key){
            return contains(node.getLeft(), key);
        }
        else if (node.getKey() < key){
            return contains(node.getRight(), key);
        }
        else {
            return true;
        }
    }

    private void preOrder(Node node) {
        if (node != null){
            System.out.print(node.getKey() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }



    //PUBLIC STUFFS
    public boolean isEmpty(){
        return root == null;
    }
    public int height (){
        return height(root);
    }

    public boolean add(Integer key) {
        if (contains(key)) return false;
        root = add(root, key);
        return true;
    }

    public boolean remove(Integer key) throws IllegalStateException {
        if (isEmpty()) throw new IllegalStateException("Tree is empty");
        if (!contains(key)) return false;
        root = remove(root, key);
        return true;
    }
    
    public boolean contains(Integer key) {
         return contains(root,key);
    }

    public void preOrder(){
        preOrder(root);
    }
}