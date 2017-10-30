package demo;

public class MyLinkedList<T> {

		private Node<T> head;
		private Node<T> tail;
		
		public MyLinkedList() {
			super();
			head = null;
			tail = null;
		}
		
		public void add(T data){
			Node<T> node = new Node<>(data);
			
			if(head == null){
				head = node;
				tail = node;
			} else {
				//adding to the end
				node.setPrevious(tail);
				tail.setNext(node);
				tail = node;
			}
		}
		
		@Override
		public String toString(){
			//if(head == null) return "null";
			String s = "head ==> ";
			Node<T> current = head;
			while (current != null) {
				s += current.getData() + " ==> ";
				current = current.getNext();
			}
			s += "null";
			s += "\ntail ==> ";
			current = tail;
			while (current != null) {
				s += current.getData() + " ==> ";
				current = current.getPrevious();
			}
			s += "null";
			return s;
		}
}
