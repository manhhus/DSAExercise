package hw3_20001949_tranvanmanh_arraylist;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unused")
public class SimpleArrayList<T extends Comparable<T>> implements ListInterface<T> {
	private T[] array;
	private int n = 0;
	private int index = -1;
	private int defaultSize = 100;
	
	@SuppressWarnings("unchecked")
	public SimpleArrayList() {
		array = (T[]) new Comparable[defaultSize];
	}
	@SuppressWarnings("unchecked")
	public SimpleArrayList(int capacity) {
		array = (T[]) new Comparable[capacity];
	}

	@Override
	public void add(T data) {
		index++;
		array[index] = data;
		n++;
	}

	@Override
	public T get(int i) {
		return array[i];
	}

	@Override
	public void set(int i, T data) {
		array[i] = data;
	}
	
	public int sequentialSearch(T data) {
		for (int i = 0; i < n; i++) {
            if (data.compareTo(array[i]) == 0) {
                return i + 1;
            }
        }
        return -1;
	}
	
	public void sort() {
		T temp;
		int minidx;
		for (int i = 0; i < n; i++) {
			minidx = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j].compareTo(array[minidx]) == -1) {
					minidx = j;
				}
			}
			temp = array[minidx];
			array[minidx] = array[i];
			array[i] = temp;

		}
	}
	
	protected int sortedBinarySearch(int l, int r, T data) {
		sort();
		if (r >= l) {
            int mid = l + (r - l) / 2;
            if (array[mid].compareTo(data) == 0)
                return mid + 1;
            if (array[mid].compareTo(data) == 1)
                return sortedBinarySearch(l, mid - 1, data);
            return sortedBinarySearch(mid + 1, r, data);
        }
        return -1;
    }

    public int unSortedBinarySearch(int l, int r, T data) {
    	if (r >= l) {
            int mid = l + (r - l) / 2;
            if (array[mid].compareTo(data) == 0)
                return mid + 1;
            if (array[mid].compareTo(data) == 1)
                return unSortedBinarySearch(l, mid - 1, data);
            return unSortedBinarySearch(mid + 1, r, data);
        }
        return -1;
    }
	
	@Override
	public void remove(T data) {
		for(int i = n-1; i >= 0; i--) {
			if(array[i].equals(data)) {
				for(int j = i ; j <= n-1; j++) {
					array[j] = array[j+1];
				}
				n--;
			}
		}
	}

	@Override
	public boolean isContain(T data) {
		for (int i = 0; i < n; i++) {
			if (array[i].equals(data)) {
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(T data) {
		for (int i = 0; i <= index; i++) {
			if(array[i].equals(data)) {
				return i ; 
			}
		}
		
		return -1 ; 
	}
	
	@Override
	public int size() {
		return n;
	}
	
	@Override
	public boolean isEmpty() {
		if(n == 0) {
			return true;
		}
		return false;
	}
		
	@Override
	public Iterator<T> iterator() {
		
		Iterator<T> a = new Iterator<T>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < n && array[currentIndex] != null;
			}

			@Override
			public T next() {
				return array[currentIndex++];
			}
		};
		return a;
	}
}
	