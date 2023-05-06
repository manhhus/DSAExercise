package hw6_20001949_tranvanmanh_bai1;

public class UnsortedLinkedPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface<K, E> {
	@SuppressWarnings("hiding")
	protected class NodeEntry<K,E> implements Entry<K,E>{
		private K key;
		private E element;
		
		private NodeEntry<K,E> next;
		public NodeEntry (K k, E e){
			key = k;
			element= e;
		}
		public K getKey() {
			return key;
		}
		@Override
		public E getValue() {
			return element;
		}
	}
	int n = 0;
    private NodeEntry<K,E> head;
    private NodeEntry<K,E> tail;

    public UnsortedLinkedPriorityQueue() {
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
	public void insert(Entry<K, E> entry) {
		// TODO Auto-generated method stub
		if(entry == null) {
			System.out.println("null");
			return;
		}
		if(n == 0) {
			head = (NodeEntry<K,E>) entry;
			tail = (NodeEntry<K,E>) entry;
		}
		else {
			tail.next = (NodeEntry<K,E>) entry;
		}
		tail = (NodeEntry<K,E>) entry;
		n++;
	}

	@Override
	public void insert(K k, E e) {
		// TODO Auto-generated method stub
		insert(new NodeEntry<K,E>(k,e));
	}

	@Override
	public Entry<K, E> removeMin() {
		// TODO Auto-generated method stub
		Entry<K,E> min = min();
		if (min == head) {
			head = head.next;
		} else {
			NodeEntry<K,E> node = head;
			while (node.next != null) {
				if (node.next == min)
					node.next = node.next.next;
				break;
			}
		}
		n--;
		return min;
	}

	@Override
	public Entry<K, E> min() {
		// TODO Auto-generated method stub
		Entry<K,E> min = head;
		NodeEntry<K,E> node = head;
		while (node != null) {
			if (min.getKey().compareTo(node.getKey()) == 1)
				min = node;
			node = node.next;
		}
		return min;
	}
	
	public void print() {
		NodeEntry<K,E> node = head;
		while (node != null) {
			System.out.println(node.key + "-" + node.element);
			node = node.next;
		}
	}
	public void printEntry(Entry<K,E> e) {		
		System.out.println(e.getKey() + "-" + e.getValue());
}
}