package hw2_20001949_tranvanmanh;

public class TestSortT {   //bài 5 gồm Sort.java và TestSortT.java ComparableInterface.java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double[] arr = { 4.1, 1.2, 3.4, 2.2, 6.6, 5.0 };
		Sort<Double> array = new Sort<Double>(arr);
		array.insertionSort(); // bubbleSort, selectionSort
		array.printArr();
	
	}
}
