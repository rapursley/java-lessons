package demo;

public class TestLinkedList {

	public static void main(String[] args) {
		System.out.println("Testing MyLinkedList with String objects.");
		
		MyLinkedList<String> list1 = new MyLinkedList<>();
		
		list1.addAtTail("a");
		list1.addAtTail("b");
		list1.addAtTail("c");
		list1.addAtTail("d");
		list1.addAtTail("e");
		list1.addAtTail("f");
		list1.addAtTail("g");
	
		System.out.println(list1);
		
		System.out.println("Testing MyLinkedList with Integer objects.");
		
		MyLinkedList<Integer> list2 = new MyLinkedList<>();
		
		list2.addAtTail(1);
		list2.addAtTail(2);
		list2.addAtTail(3);
		list2.addAtTail(4);
		list2.addAtTail(5);
		list2.addAtTail(6);
		list2.addAtTail(7);
	
		System.out.println(list2);
		
		System.out.println("Testing MyLinkedList with adding Integer objects in order.");
		
		MyLinkedList<Integer> list3 = new MyLinkedList<>();
		
		list3.addInOrder(2);
		list3.addInOrder(4);
		list3.addInOrder(6);
		list3.addInOrder(9);
		list3.addInOrder(3);
		list3.addInOrder(5);
		list3.addInOrder(7);
	
		System.out.println(list3);
	}

}
