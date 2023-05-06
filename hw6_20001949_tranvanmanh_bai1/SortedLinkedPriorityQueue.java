package hw6_20001949_tranvanmanh_bai1;

public class SortedLinkedPriorityQueue<K extends Comparable<K>, E> implements PriorityQueueInterface<K, E> {
	@SuppressWarnings("hiding")
	protected class NodeEntry<K,E> implements Entry<K,E>{
		private K key;
		private E element;
		private NodeEntry<K,E> pre;
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
		@Override
		public String toString() {
			return "NodeEntry [key=" + key + ", element=" + element + "]";
		}
	}
	int n = 0;
    private NodeEntry<K,E> head;
    private NodeEntry<K,E> tail;

    public SortedLinkedPriorityQueue() {
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
	public void insert(Entry<K, E> entr) {
		// TODO Auto-generated method stub
		NodeEntry<K,E> entry = (NodeEntry<K,E>) entr;
		boolean check = false;
		if(entry == null) {
			System.out.println("null");
			return;
		}
		if(n == 0) {
			head = (NodeEntry<K,E>) entry;
			tail = (NodeEntry<K,E>) entry;
		}
		else {
			if (entry.getKey().compareTo(head.key) < 1) {  
				entry.next = head;
                head.pre = entry;
                head = entry;
			} else {
				NodeEntry<K,E> temp = head.next;
                while (temp != null) {
                    if (entry.getKey().compareTo(temp.key) < 1) {
                    	entry.pre = temp.pre;
                    	entry.next = temp;
                        temp.pre.next = entry;   
                        check = true;
                        break;
                    }
                    temp = temp.next;
                }
                if (!check) {           
                	temp = entry;
                    tail.next = temp;
                    temp.pre = tail;
                    tail = temp;
                }
			}
		}
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
		Entry<K,E> min = head;
		head = head.next;
		n--;
		return min;
	}

	@Override
	public Entry<K, E> min() {
		return head;
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