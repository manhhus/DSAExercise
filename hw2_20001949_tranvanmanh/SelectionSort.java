package hw2_20001949_tranvanmanh;

public class SelectionSort {
	
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
			System.out.print("Sorting...: ");
			printArr(array);
		}
		printArr(array);
		System.out.println("Times swap: " + sumswap);
		System.out.println("Times compare: " + sumcompare);
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Initial array: ");
        printArr(arr);
		selectionSort(arr);

	}

}
