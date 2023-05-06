package hw2_20001949_tranvanmanh;

public class Sort<T extends Comparable<T>> implements ComparableInterface<T> {	
    
	private T[] array;
    
	public Sort(){
    	
    }
	
    public Sort(T[] array){
        this.array = array;
    }
    
    public void setArray(T[] array) {
    	this.array = array;
    }
    
    public void printArr() {
    	for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i].toString());
			} else {
				System.out.print(", " + array[i].toString());
			}
		}
		System.out.println("]");
    }
    
    public void bubbleSort() {       
        T temp;
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; ++i) {				
				if (array[i - 1].compareTo(array[i]) > 0) {				
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n--;				
		} while (swapped);
    }
    
    public void selectionSort() {
        T temp;
		int minidx;
		for (int i = 0; i < array.length; i++) {
			minidx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[minidx]) < 0) {
					minidx = j;					
				}
			}
			temp = array[minidx];
			array[minidx] = array[i];
			array[i] = temp;
		}
    }
    
    public void insertionSort() {
        int length = array.length;
		for (int i = 1; i < length; i++) {
			T key = array[i];
			int j = i - 1;			
			while (j >= 0 && array[j].compareTo(key) > 0) {
				
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
    }
}