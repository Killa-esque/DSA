public class Main {
    public static void main (String[] args){
        AVL avl = new AVL();
        avl.add(15);
        avl.add(6);
        avl.add(23);
        avl.add(4);
        avl.add(7);
        avl.add(71);
        avl.add(5);
        avl.add(50);
        avl.remove(15);
        avl.preOrder();
    }
}