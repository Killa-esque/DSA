public class TestLinkedList {
    public static void main(String[] args) {
        LLInterface myLList = new IntLinkedList();
        myLList.addFirst(6);
        myLList.addFirst(5);
        myLList.addFirst(4);
        myLList.addFirst(3);
        myLList.addFirst(2);
        myLList.addFirst(1);
        System.out.println(myLList);
        if (myLList.checkSorted()) {
            System.out.println("Linked list is sorted");
        }
        else{
            System.out.println("Linked list is not sorted");

        }
        // System.out.println(myLList.size());
        // System.out.println(myLList.countOdd());
        // System.out.println(myLList.searchKey(7));
        System.out.println(myLList.removeAt(5));
        System.out.println(myLList);
    }
}
