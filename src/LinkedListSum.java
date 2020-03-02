/**
 * Sum two integers that digits contain in linked lists in reverse order
 * Go threw list and calc sum
 */

public class LinkedListSum {

    // run point
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>(7, 1, 6); // 617
        MyLinkedList<Integer> list2 = new MyLinkedList<>(5 , 9, 2); // 295
        MyLinkedList.Node node1 = list1.head;
        MyLinkedList.Node node2 = list2.head;
        int sum = ListToInt(list1) + ListToInt(list2);
        System.out.println(list1 + " + " + list2 + " " + sum); // 617 + 295 = 912
    }

    // returns int by digits in linked list in reverse order
    static int ListToInt(MyLinkedList list) {
        int multi = 1;
        int sum = 0;
        MyLinkedList.Node node = list.head;
        // cycle a list and calculate int
        while (node != null) {
                sum += multi * (Integer) node.getData();
                multi *= 10;
                node = node.next();
        }
        return sum;
    }

}
