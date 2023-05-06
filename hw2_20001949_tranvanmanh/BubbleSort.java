package hw2_20001949_tranvanmanh;

public class BubbleSort {

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
			System.out.print("Sorting...: ");
			printArr(array);
		} while (swapped);
		printArr(array);
		System.out.println("Times swap: " + sumswap);
		System.out.println("Times compare: " + sumcompare);
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

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Initial array: ");
		printArr(arr);
		bubbleSort(arr);

	}

}