package Collections.LinkedList;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
 */

public class MiddleOfLinkedList876 {
    int val;
    MiddleOfLinkedList876 next;

    MiddleOfLinkedList876() {
    }

    MiddleOfLinkedList876(int val) {
        this.val = val;
    }

    MiddleOfLinkedList876(int val, MiddleOfLinkedList876 next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "MiddleOfLinkedList876(" +
                "val=" + val +")";
    }

    public static void main(String[] args) {
        MiddleOfLinkedList876 node1 = new MiddleOfLinkedList876(1);
        MiddleOfLinkedList876 node2 = new MiddleOfLinkedList876(3);
        MiddleOfLinkedList876 node3 = new MiddleOfLinkedList876(4);
        MiddleOfLinkedList876 node4 = new MiddleOfLinkedList876(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println(middleNode(node1));
    }


    public static MiddleOfLinkedList876 middleNode(MiddleOfLinkedList876 head) {
        MiddleOfLinkedList876 middle = head;
        MiddleOfLinkedList876 end = head;
        int size = 0;

        while (end != null && end.next != null){
            middle = middle.next;
            end = end.next.next;
            size++;
        }
        return middle;
        }
    }

