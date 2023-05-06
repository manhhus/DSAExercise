package hw6_20001949_tranvanmanh_bai1;

public class SortedArrayPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface<K,E> {

	
	@SuppressWarnings("hiding")
	protected class ArrEntry<K,E>  implements Entry<K,E> {
		K key;
		E element;
		public ArrEntry(K k, E e) {
			key = k;
			element = e;
		}
		@Override
		public K getKey() {
			return key;
		}
		@Override
		public E getValue() {
			return element;
		}
	}
	
	protected ArrEntry<K,E>[] array;
	protected int n = 0;
	protected int defaultsize = 1000;
	
	@SuppressWarnings("unchecked")
	public SortedArrayPriorityQueue() {
        array = new SortedArrayPriorityQueue.ArrEntry[defaultsize];
    }
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return n == 0;
	}

	@Override
	public void insert(Entry<K,E> entry) {
		// TODO Auto-generated method stub
		insert(entry.getKey(),entry.getValue());		
	}
	
	@Override
	public void insert(K k, E e) {
		// TODO Auto-generated method stub
		array[n] = new ArrEntry<K,E>(k, e);
		n++;
		ArrEntry<K,E> temp;
		boolean swapped;
		int length = n;
		do {
			swapped = false;
			for (int i = 1; i < length; i++) {
				if (array[i - 1].key.compareTo(array[i].key) == -1) {
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			length--;
		} while (swapped);
	}

	
	@Override
	public Entry<K,E> removeMin() {
		Entry<K,E> rem = min();
		n--;
		return rem;
	}
	
	@Override
	public Entry<K,E> min() {
		
		return array[n-1];
		
	}
	
	public void print() {
		for(int i = 0; i < n; i++) {
			System.out.println(array[i].getKey() + " " + array[i].getValue());
		}
	}
	
	public void printEntry(Entry<K,E> e) {		
			System.out.println(e.getKey() + " " + e.getValue());
	}
	
}