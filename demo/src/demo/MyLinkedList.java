package demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T extends Comparable<T>> implements List<T>{

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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
