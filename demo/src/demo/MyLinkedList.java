package demo;

public class MyLinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;

	public MyLinkedList() {
		super();
		head = null;
		tail = null;
	}

	public void addAtTail(T data) {
		Node<T> node = new Node<>(data);

		if (head == null) {
			head = node;
			tail = node;
		} else {
			// adding to the end
			node.setPrevious(tail);
			tail.setNext(node);
			tail = node;
		}
	}

	public void addInOrder(T data) {
		Node<T> after = head;
		Node<T> before = null;

		while (after != null && data.compareTo(after.getData()) > 0) {
			before = after;
			after = after.getNext();
		}

		if (after == null) {
			addAtTail(data);
			return;
		}

		Node<T> node = new Node<>(data);

		if (before == null) {
			head = node;
			// adding between before and after
			node.setPrevious(null);
			node.setNext(after);
			after.setPrevious(node);
		} else {
			// adding between before and after
			node.setPrevious(after.getPrevious());
			node.setNext(before.getNext());
			before.setNext(node);
			after.setPrevious(node);
		}

	}

	@Override
	public String toString() {
		// if(head == null) return "null";
		String s = "head ==> ";
		Node<T> current = head;
		while (current != null) {
			s += current.getData() + " ==> ";
			current = current.getNext();
		}
		s += "null\n";
		String s2 = " <== tail";
		current = tail;
		while (current != null) {
			s2 = " <== " + current.getData() + s2;
			current = current.getPrevious();
		}
		s2 = "null" + s2;
		return s + s2;
	}
}
