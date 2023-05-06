package hw6_20001949_tranvanmanh_bai1;

public class UnsortedArrayPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface<K,E> {

	
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
		@Override
		public String toString() {
			return "NodeEntry [key=" + key + ", element=" + element + "]";
		}
	}
	
	ArrEntry<K,E>[] array;
	int n = 0;
	int defaultsize = 1000;
	
	@SuppressWarnings("unchecked")
	public UnsortedArrayPriorityQueue() {
        array = new UnsortedArrayPriorityQueue.ArrEntry[defaultsize];
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
		array[n] = (ArrEntry<K,E>) entry;
		n++;
	}

	@Override
	public void insert(K k, E e) {
		// TODO Auto-generated method stub
		array[n] = new ArrEntry<K,E>(k, e);
		n++;
	}

	@Override
	public Entry<K,E> removeMin() {
		if (!isEmpty() ) {
			ArrEntry<K,E> min = (ArrEntry<K,E>) min();
			for (int i = 0; i < n; i++) {
				if (((Comparable<K>) array[i].key).compareTo(min.key) == 0) {
					array[i] = array[i+1];
				}
				
			}
			n--;
			return (Entry<K,E>) min;
		}
		return null;
	}
	
	@Override
	public Entry<K,E> min() {
		if (!isEmpty() ) {
			ArrEntry<K,E> min = array[0];
			for (int i = 1; i < n; i++) {
				if (((Comparable<K>) array[i].getKey()).compareTo(min.getKey()) < 1) 
					min = array[i];
				
			}
			return (Entry<K,E>) min;
		}
		return null;
		
	}
	public void print() {
		for(int i = 0; i < n; i++) {
			System.out.println(array[i].getKey() + "-" + array[i].getValue());
		}
	}
	
	public void printEntry(Entry<K,E> e) {		
			System.out.println(e.getKey() + "-" + e.getValue());
	}
	
}