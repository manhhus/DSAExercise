package hw4_20001949_tranvanmanh_stack;

import java.util.Iterator;

public class ArrayStack<E> implements StackInterface<E> {
	private E[] stack;
	private int top = 0;
	private int capacity = 100;
	
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		stack = (E[]) new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		stack = (E[]) new Object[capacity];
	}
	
	public void push(E element) {
		stack[top] = element;
		top++;
	}
	
	public E pop() {
		top--;
		return stack[top];
	}
	
	public E top() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public Iterator<E> iterator() {
		return new StackIterator();
	}
	
	class StackIterator implements Iterator<E> {
		private int i = top;
		public boolean hasNext() {
			return (i > 0);
		}
		
		public E next() {
			return (E) stack[--i];
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
	
	
}