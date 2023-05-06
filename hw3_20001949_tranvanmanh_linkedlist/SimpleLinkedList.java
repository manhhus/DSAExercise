package hw3_20001949_tranvanmanh_linkedlist;

import java.util.Iterator;

public class SimpleLinkedList<T> implements ListInterface<T> {
	class Node {
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
		}
		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node top = null;
	private Node bot = null;
	private int n = 0;
		
	@Override
	public void add(T data) {
		Node node = new Node(data);
		if (top == null) {
			top = node;
			bot = top;
		} else {
            node.next = top;
            top = node;
		}
		n++;
	}

	public void addBot(T data) {
		if (n == 0) {
			top = new Node(data);
			bot = top;
		} else {
			Node node = new Node(data);
			bot.setNext(node);
			bot = node;
		}
		n++;
	}
	
	@Override
	public T get(int i) {
		if (i >= size() || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = top;
		for (int j = 0; j < i; j++) {
			temp = temp.next;
		}

		return temp.data;
	}
	
	@Override
	public void set(int i, T data) {
		if (i < 0 || i > n - 1) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = top;
		for (int j = 0; j < i; j++) {
			temp = temp.getNext();
		}
		temp.setData(data);
	}
	
	@Override
	public boolean isContain(T data) {
		Node node = top;
		for (int i = 0; i < n; i++) {
			if (node.getData().equals(data)) {
				return true;
			} else {
				node = node.getNext();
			}
		}
		return false;
	}
	
	@Override
	public int size() {
		return n;

	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0;

	}

	public T removeTop() {
		T res = top.getData();
		if (n > 1) {
			top = top.getNext();

		} else {
			top = null;
			bot = null;
		}
		n--;
		return res;
	}

	public T removeBot() {
		T res = bot.getData();
		Node nearEnd = top;
		while (nearEnd.next.next != null) {
			nearEnd = nearEnd.next;
		}
		nearEnd.next = null;
		n--;
		return res;
	}
	
	@Override
	public void remove(T data) {
		Node temp = top;            
		Node afterTemp = null;
		while (temp != null) {
			if (temp.data.equals(data)) {
				if (afterTemp == null) {
					top = top.next;
				} else {
					afterTemp.next = temp.next;
				}
				temp.data = null;
				n--;
			}
			afterTemp = temp;
			temp = temp.next;
		}
	}

	@Override
	public int indexOf(T data) {
		Node node = top;
		for (int i = 0; i < n; i++) {
			if (node.getData().equals(data)) {
				return i;
			} else {
				node = node.getNext();
			}
		}
		return -1;
	}
	
	public void printList() {
		Node node = top;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return null;
	}
	
}
