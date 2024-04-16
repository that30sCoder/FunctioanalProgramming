package org.javacollection;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        sll.head.next = second;
        ListNode third = new ListNode(15);
        second.next = third;
        ListNode fourth  = new ListNode(8);
        third.next = fourth;

        ListNode current = sll.head;
        while(current!=null){
            System.out.println("LinkedList Data is " + current.data);
            current = current.next;
        }

        int dataTobeInsert = 12;
        ListNode nodeToInsert = new ListNode(12);
        if(sll.head==null){
            sll.head = nodeToInsert;
        }
        else {
            ListNode currentNode = sll.head;
            while (currentNode != null) {

                if (currentNode.next != null)
                    currentNode = currentNode.next;
                else {
                    currentNode.next = nodeToInsert;
                    nodeToInsert.next = null;
                    break;
                }
            }
        }
        ListNode currentPrint = sll.head;
        while(currentPrint!=null){
            System.out.println("LinkedList Data after change " + currentPrint.data);
            currentPrint = currentPrint.next;
        }

    }


}
