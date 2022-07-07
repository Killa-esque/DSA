public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList myList = new DoubleLinkedList();
        myList.addFirst(1.2);
        myList.addFirst(3.3);
        myList.addFirst(4.2);
        myList.addFirst(5.3);
        myList.addFirst(2.2);
        myList.addFirst(0.2);
        System.out.println(myList);
    }
}