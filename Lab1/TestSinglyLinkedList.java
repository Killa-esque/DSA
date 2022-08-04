public class TestSinglyLinkedList{
    public static void main(String[] args){
        ListInterface<Integer> myList = new SinglyLinkedList<Integer>();
        IntegerLinkedList list = new IntegerLinkedList();
        // list.addFirst(5);
        // list.addFirst(2);
        // list.addFirst(8);
        // list.addFirst(7);
        // list.addFirst(10);
        // System.out.println(list);
        // System.out.println(list.countEven());
        // System.out.println(list.countPrime());


        myList.addFirst(5);
        myList.addFirst(6);
        myList.addFirst(1);
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addLast(10);
        myList.selection();
        System.out.println(myList);

        // myList.reverse();

        // System.out.println(myList.getHead());
        // Node<Integer> headRef = myList.mergeSort(myList.getHead());
        // myList.printList(headRef);







        // ListInterface<Fraction> myFraction = new SinglyLinkedList<Fraction>();
        // Fraction f = new Fraction(5,6);
        // Fraction f1 = new Fraction(5,6);
        // Fraction f2 = new Fraction(5,6);
        // myFraction.addFirst(f);
        // myFraction.addFirst(f1);
        // myFraction.addFirst(f2);
        // System.out.println(myFraction);

    }
}