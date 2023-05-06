package hw4_20001949_tranvanmanh_stack;

import java.util.Iterator;


public class LinkedStack<E> implements StackInterface<E> {
	private class Node {
		E element;
		Node next;
	}
	
	private Node stack = null;
	
	public void push(E element) {
		Node node = new Node();
		node.element = element;
		node.next = stack;
		stack = node;
	}
	
	public E pop() {
		E element = stack.element;
		stack = stack.next;
		return element;
	}
	

	public E top() {
		return stack.element;
	}
	
	public boolean isEmpty() {
		return (stack == null);
	}
	
	public Iterator<E> iterator() {
		return new LinkedListStackIterator();
	}
	
	private class LinkedListStackIterator implements Iterator<E> {
		private Node current = stack;
		
		public boolean hasNext() {
			return current != null;
		}
		
		public E next() {
			E data = (E) current.element;
			current = current.next;
			return data;
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
