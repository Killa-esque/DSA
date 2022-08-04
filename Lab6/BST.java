public class BST<E extends Comparable<E>> implements TreeADT<E> {
    private Node<E> root;
    private int nodeCount = 0;

    @Override
    public boolean isEmpty() {
        return nodeCount == 0;
    }

    @Override
    public int size() {
        return nodeCount;
    }

    @Override
    public Node<E> getRoot() {
        return root;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public boolean contains(E key) {
         return contains(root,key);
    }

    @Override
    public boolean add(E key) {
        if (contains(key)) return false;
        root = add(root, key);
        nodeCount++;
        return true;
    }

    @Override
    public boolean remove(E key) {
        if (!contains(key)) return false;
        root = remove(root, key);
        nodeCount--;
        return true;
    }

    @Override
    public void traverseAscending(){
        traverseAscending(root);
    }

    @Override
    public void traverseDescending(){
        traverseDescending(root);
    }

    @Override
    public void levelOrder(){
        printLevelOrder(root);
    }

    @Override
    public E getLeftMostOfRight (){
        return leftMostOfRight(root);
    }

    @Override
    public void deleteMin(){
        root = deleteMin(root);
    }

    @Override
    public void deleteMax(){
        root = deleteMax(root);
    }

    @Override
    public Integer sum (Node<E> x){
        if (x == null) return 0;
        return (Integer) x.getData() + sum(x.getLeft()) + sum(x.getRight());
    }

    @Override
    public Integer sum (){
        return sum(root);
    }

    //PRIVATE


    private Node<E> deleteMin(Node<E> node){
        if (node.getLeft() == null){
            return node.getRight();
        }
        node.setLeft(deleteMin(node.getLeft()));
        return node;

    }
    private Node<E> deleteMax(Node<E> node){
        if (node == null){
            return null;
        }
        if (node.getRight() == null) return node.getLeft();
        Node<E> parent = node;
        Node<E> child = parent.getRight();
        while (child.getRight() != null){
            parent = child;
            child = child.getRight();
        }
        parent.setRight(null);
        return node;
    }

    private void printLevelOrder(Node<E> node)
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            levelOrder(node, i);
    }

    private void levelOrder(Node<E> node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.getData() + " ");
        else if (level > 1) {
            levelOrder(node.getLeft(), level - 1);
            levelOrder(node.getRight(), level - 1);
        }
    }

    private void traverseAscending(Node<E> node) {
        if (node != null){
            traverseAscending(node.getLeft());
            System.out.print(node.getData() + " ");
            traverseAscending(node.getRight());
        }
    }

    private void traverseDescending(Node<E> node) {
        if (node != null){
            traverseDescending(node.getRight());
            System.out.print(node.getData() + " ");
            traverseDescending(node.getLeft());
        }
    }

    private int height(Node<E> node){
        if (node == null) return -1;
        return 1 + Math.max(height(node.getLeft()),height(node.getRight()));
    }

    private boolean contains(Node<E> node, E key) throws IllegalStateException, IllegalArgumentException{
        if (node == null){
            return false;
        }
        if (node.getData().compareTo(key) > 0){
            return contains(node.getLeft(), key);
        }
        else if (node.getData().compareTo(key) < 0){
            return contains(node.getRight(), key);
        }
        else {
            return true;
        }
    }

    private Node<E> add(Node<E> node, E key){
        if (node == null){
            return new Node<E>(key,null,null);
        }
        else {
            if (key.compareTo(node.getData()) < 0){
                node.setLeft(add(node.getLeft(),key));
            }
            else {
                node.setRight(add(node.getRight(),key));
            }
        }
        return node;
    }

    private Node<E> remove (Node<E> node, E key) throws IllegalStateException{
        if (isEmpty()) throw new IllegalStateException("Tree is empty");
        int flag = node.getData().compareTo(key);
        if (flag > 0){
            node.setLeft(remove(node.getLeft(), key));
        }
        else if (flag < 0){
            node.setRight(remove(node.getRight(), key));
        }
        else{
            if (node.getLeft() == null){
                Node<E> rightNode = node.getRight();
                node.setData(null);
                node = null;
                return rightNode;
            }
            else if (node.getRight() == null){
                Node<E> leftNode = node.getLeft();
                node.setData(null);
                node = null;
                return leftNode;
            }
            else {
                E tmp = leftMostOfRight(node);
                node.setData(tmp);
                node.setRight(remove(node.getRight(), key));
            }
        }
        return node;
    }

    private E leftMostOfRight(Node<E> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getData();
    }

    // private E rightMostOfLeft(Node<E> node) {
    //     while (node.getRight() != null) {
    //         node = node.getRight();
    //     }
    //     return node.getData();
    // }




}
