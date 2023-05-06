package hw1_20001949_tranvanmanh;

import java.util.Scanner;

/*public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Generic<Integer> intGeneric = new Generic<>(10);		
		for (int i = 0; i < intGeneric.length; i++) {
			intGeneric.setArray = (i, )
			intGeneric[i] = new Generic<>((int) (i * 2 + 1));		
			if (intGeneric[i].perfectNumber()) {
				System.out.println("Perfect number: " + intGeneric[i].getArray());
			}
		}
  
		sc.close();

	}

}*/


public class TestGeneric {

    public boolean isPrime(int num) { // custom condition

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPerfect(int num) {

        if (num <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public void run(Scanner sc) {

        System.out.println("Enter the size of this array: ");

        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter each element of this array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Perfect numbers: ");
        for (int num : arr) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nPrime numbers: "); // custom condition
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public void genericRun(Scanner sc) { //generic array

        System.out.println("Enter the size of this array: ");
        NumbersArray<Integer> intArray = new NumbersArray<>(sc.nextInt());
        System.out.println("Enter each element of this int array: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray.set(i, sc.nextInt());
        }
        System.out.println("Int array: " + intArray);

        System.out.println("Enter the size of this array: ");
        NumbersArray<Double> realArray = new NumbersArray<>(sc.nextInt());
        System.out.println("Enter each element of this real array: ");
        for (int i = 0; i < realArray.length; i++) {
            realArray.set(i, sc.nextDouble());
        }
        System.out.println("Real array: " + realArray);

        /*System.out.println("Enter the size of this array: ");
        NumbersArray<String> strArray = new NumbersArray<>(sc.nextInt()); //shows error, type parameter is not within its bound.
        System.out.println("Enter each element of this string array: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray.set(i, sc.nextLine());
        }
        System.out.println("String array: " + strArray);*/
    }

    public static void main(String[] args) {

        TestGeneric bai2 = new TestGeneric();

        Scanner sc = new Scanner(System.in);

        bai2.run(sc);
        bai2.genericRun(sc);
    }
}
