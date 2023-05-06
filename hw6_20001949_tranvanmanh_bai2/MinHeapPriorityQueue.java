package hw6_20001949_tranvanmanh_bai2;
import hw6_20001949_tranvanmanh_bai1.*;
@SuppressWarnings("unused")
public class MinHeapPriorityQueue<K extends Comparable<K>, E> extends SortedArrayPriorityQueue<K,E> {

	ArrEntry<K,E> heapPQ[] = array;
	//Các phương thức bổ sung
	
	public MinHeapPriorityQueue() {
        super();
    }	
    
	private int parent(int p) {
        return p % 2 == 0 ? (p - 1) / 2 : p / 2;
    }
    
    private int left(int p) {
        return 2 * p + 1;
    }
    
    private int right(int p) {
        return 2 * p + 2;
    }

    
	private void swap(int i, int j) {
		ArrEntry<K,E> temp = heapPQ[i];
		heapPQ[i] = heapPQ[j];
        heapPQ[j] = temp;
	}
	@Override
	public void insert(K k, E e) {				
        heapPQ[n] = new ArrEntry<K,E>(k,e);
        n++;
        upHeap();
    }
	
	@Override
	public Entry<K, E> removeMin() {
		Entry<K,E> temp = min();		
	    swap(0, n-1);
	    n--;
	    downHeap();
	    return temp;
	}
	@Override
	public Entry<K, E> min() {
	    return heapPQ[0];
	}
	
	protected void upHeap() { //vun lên
		int i = n-1;
        while (heapPQ[i/2].getKey().compareTo(heapPQ[i].getKey()) == 1 && i > 0) {
            swap(i/2, i);
            i = i/2;           
        }
	} 
	public int sumswap = 0;
	public int sumcompare = 0;  
	protected void downHeap() { //vun xuống
        int i = 0;
        while (i < n) {
            if (2*i+2 < n) {
            	sumcompare += 1;
                int largest = i;
                if (heapPQ[largest].getKey().compareTo(heapPQ[2*i+1].getKey()) >= 0) {
                	largest = 2*i+1;
                	sumcompare += 1;
                }
                if (heapPQ[largest].getKey().compareTo(heapPQ[2*i+2].getKey()) >= 0)
                	largest = 2*i+2;
                	sumcompare += 1;
                if (largest != i) {
                    swap(largest, i);
                    sumswap += 1;
                    sumcompare += 1;
                    i = largest;
                }
            } else if (2*i+1 < n) {
            	sumcompare += 1;
            	if(heapPQ[i].getKey().compareTo(heapPQ[2*i+1].getKey()) >= 0) {
            		swap(i, 2*i+1);
            		sumcompare += 1;
            		sumswap += 1;
            	}	
            }
            break;
        }
	}
	
	
}