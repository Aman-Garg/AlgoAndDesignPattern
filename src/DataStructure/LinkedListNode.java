package DataStructure;

public class LinkedListNode {

	private LinkedListNode next;
	private Integer data;

	public LinkedListNode(Integer data) {
		this.data = data;
		this.next = null;
	}
	public LinkedListNode() {
	}
	public LinkedListNode getNext() {
		return next;
	}
	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}

	public void traverse(LinkedListNode node) {
		while(node != null) {
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}
	}

	public void insert(LinkedListNode ptr, Integer number) {
		while(ptr.getNext() != null) {
			ptr = ptr.getNext();
		}
		System.out.println("check");
		LinkedListNode ctr = new LinkedListNode(number);
		ptr.next = ctr;
	}

}
