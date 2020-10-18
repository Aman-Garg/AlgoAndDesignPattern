package code.linkedList;

import DataStructure.LinkedListNode;

public class MiddleNode {
	public static void main(String agrs[]) {
		LinkedListNode linkedListNode = new LinkedListNode(5);
		linkedListNode.insert(linkedListNode, 10);
		linkedListNode.insert(linkedListNode, 15);
		linkedListNode.insert(linkedListNode, 20);
		linkedListNode.insert(linkedListNode, 25);
		linkedListNode.traverse(linkedListNode);

		System.out.println();

		LinkedListNode ptr, ctr;
		ptr = linkedListNode;
		ctr = linkedListNode;

		while(ptr!= null && ptr.getNext()!= null){
			ctr = ctr.getNext();
			ptr=ptr.getNext().getNext();
		}

		System.out.println(ctr.getData());
	}
}
