package code.linkedList;

import DataStructure.LinkedListNode;

public class CycleInLinkedList {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.insert(head, 2);
        head.insert(head, 3);
        head.insert(head, 4);
        head.insert(head, 5);
        head.insert(head, 6);
        head.insert(head, 7);

        LinkedListNode ptr = head;
        LinkedListNode ctr = head;
        int i = 0;
        while(ctr.getNext() != null){
            if(i<1){
                i++;
                ptr = ptr.getNext();
            }
            ctr = ctr.getNext();
        }

        ptr.setNext(ctr);

        // created the loop in the linked list till now, now we will find and remove the loop from the linkedlist
        ptr = head; // fast pointer
        ctr = head; // slow pointer

        while(ptr != null && ctr != null && ptr.getNext() != null){
            ctr = ctr.getNext();
            ptr = ptr.getNext().getNext();

            if(ctr == ptr){
                System.out.println(ctr.getData());
                ctr.setNext(null);
            }
        }

        head.traverse(head);


    }

    private void removeLoop(LinkedListNode linkedListNode, LinkedListNode node){
        while(linkedListNode.getNext() != node){
            linkedListNode = linkedListNode.getNext();
        }

        linkedListNode.setNext(null);
    }
}
