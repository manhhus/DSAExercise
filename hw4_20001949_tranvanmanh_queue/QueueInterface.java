package hw4_20001949_tranvanmanh_queue;

public interface QueueInterface<E> extends Iterable<E>{
	public void enqueue(E element);
	public E dequeue();
	public boolean isEmpty();
}
