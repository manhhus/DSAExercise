package hw4_20001949_tranvanmanh_queue;

import java.util.Iterator;

public class LinkedQueue<E> implements QueueInterface<E> {
	private class Node {
		E element;
		Node next;			
	
	}
	
	private Node queue = null;
	Node head = null;
	Node tail = null;
	
	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.element = element;
		node.next = null;
		if(isEmpty()) {
			head = node;
			tail = head;
		}
		tail.next = node;
		tail = node;
		
//		Node node = tail;
//		tail =	new Node();
//		tail.element = element;
//		tail.next = null;
//		if(isEmpty()) head = tail;
//		else node.next = tail;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		Node ans = head;
		head = head.next;
		return ans.element;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public Iterator<E> iterator() {
		return new LinkedListQueueIterator();
	}
	
	private class LinkedListQueueIterator implements Iterator<E> {
		private Node current = queue;
		
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
