public class Exercise8 {
    public static void main(String[] args) {
        ListInterface<Integer> myLinkedList = new SinglyLinkedList<>();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(8);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(5);
        myLinkedList.addSortedList(9);
        System.out.println(myLinkedList);
    }
}
