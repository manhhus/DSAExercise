package hw4_20001949_tranvanmanh_queue;

import java.util.Iterator;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements QueueInterface<E> {

	private E[] queue;
	private int n = 0;
	private int top = 0;
	private int count = 0;
	private int default_size = 100;

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		n = capacity;
		queue = (E[]) new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue() {
		n = default_size;
		queue = (E[]) new Object[default_size];
	}

	@Override
	public void enqueue(E element) throws IllegalStateException {
		if (count == queue.length) {
			throw new IllegalStateException("Stack is full.");
		}
		int vail = (top + count) % n;
		queue[vail] = element;
		count++;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		E temp = queue[top];
		queue[top] = null;
		top = (top + 1) % n;
		count--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new ArrayQueueIterator();
	}

	class ArrayQueueIterator implements Iterator<E> {

		private int current = top;
		private int num = 0;

		@Override
		public boolean hasNext() {
			return num < count;
		}

		@Override
		public E next() {

			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			E data = queue[(current + num) % n];
			num++;

			return data;
		}
	}

}