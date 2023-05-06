package hw6_20001949_tranvanmanh_bai3;

import hw6_20001949_tranvanmanh_bai2.*;

public class HeapSort {
	public static void main(String[] args) {
		int arr1[] = {4,2,1,5,3};
		int arr2[] = {4,2,1,5,3};
		int arr3[] = {4,2,1,5,3};
		int arr4[] = {4,2,1,5,3};
		heapSort(arr1);
		bubbleSort(arr2);
		insertionSort(arr3);
		selectionSort(arr4);
		// heapSort tốt nhất!!
	}
	
	public static void heapSort(int[] arr) {
		MinHeapPriorityQueue<Integer, Character> a = new MinHeapPriorityQueue<Integer, Character>();
		for (int i=0; i < arr.length; i++) //insert all elements of A as keys into T
			a.insert(arr[i], null);
		for (int i=0; i < arr.length; i++) {//extract the elements from T to A and A is sorted
			arr[i] = a.removeMin().getKey();				
		}
		printArr(arr);
		System.out.println("Heap Times swap: " + a.sumswap);
		System.out.println("Heap Times compare: " + a.sumcompare);
	}
	public static void bubbleSort(int[] array) {
		int temp;
		int sumswap = 0;
		int sumcompare = 0;
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; ++i) {
				sumcompare += 1;
				if (array[i - 1] > array[i]) {
					sumswap += 1;
					temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n--;
		} while (swapped);
		printArr(array);
		System.out.println("Bubble Times swap: " + sumswap);
		System.out.println("Bubble Times compare: " + sumcompare);
	}
	public static void insertionSort(int[] array) {
		int sumswap = 0;
		int sumcompare = 0;
		int length = array.length;

		for (int i = 1; i < length; i++) {
			int key = array[i];
			int j = i - 1;
			sumcompare += 1;
			while (j >= 0 && array[j] > key) {
				sumswap += 1;
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		printArr(array);
		System.out.println("Insertion Times swap: " + sumswap);
		System.out.println("Insertion Times compare: " + sumcompare);
	}
	public static void selectionSort(int[] array) {
		int temp;
		int sumswap = 0;
		int sumcompare = 0;
		int minidx;
		for (int i = 0; i < array.length; i++) {
			minidx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minidx]) {
					minidx = j;
					sumswap += 1;
				}
			}
			temp = array[minidx];
			array[minidx] = array[i];
			array[i] = temp;
			sumcompare += 1;
		}
		printArr(array);
		System.out.println("Selection Times swap: " + sumswap);
		System.out.println("Selection Times compare: " + sumcompare);
	}
	public static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("[" + array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.println("]");
	}
}
