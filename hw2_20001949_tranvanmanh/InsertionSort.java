package hw2_20001949_tranvanmanh;

public class InsertionSort {
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
			
			System.out.print("Sorting...: ");
			printArr(array);
		}
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

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.print("Initial array: ");
		printArr(array);
		insertionSort(array);
	}

}