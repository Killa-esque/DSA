public class Test {
    public static TreeADT<String> createTree(String strKey) {
        TreeADT<String> tree = new BST<String>();
        String[] strKeys = strKey.split(" ");
        for (String str : strKeys) {
            tree.add(str);
        }
        return tree;
    }
    public static void main(String[] args) {
        TreeADT<Integer> tree = new BST<Integer>();
        tree.add(15);
        tree.add(6);
        tree.add(23);
        tree.add(4);
        tree.add(7);
        tree.add(71);
        tree.add(5);
        tree.add(50);
        // tree.add(29);
        // tree.add(50);
        // tree.add(91);
        // tree.add(32);
        // tree.add(72);
        // tree.add(99);
        // tree.traverse();
        // System.out.println();
        // tree.levelOrder();
        // System.out.println();
        // System.out.println(tree.height());
        // System.out.println(tree.getLeftMostOfRight());
        // tree.deleteMin();
        // tree.traverse();
        // System.out.println();
        // tree.deleteMin();
        // tree.traverse();
        // System.out.println();
        // tree.deleteMax();
        // tree.traverse();
        // System.out.println();
        // tree.deleteMax();
        // tree.traverse();
        // Node<Integer> root =  tree.getRoot();
        // System.out.println(tree.sum(root.getLeft()));
    }
}
