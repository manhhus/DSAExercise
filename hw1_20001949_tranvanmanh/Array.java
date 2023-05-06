package hw1_20001949_tranvanmanh;

import java.util.*;

public class Array {
	public static void main(String126[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Nhập dãy n số nguyên: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("Số hoàn hảo trong dãy: ");
		for(int i = 0; i < n; i++) {
			if (checkSohoanhao(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.print("\nSố chẵn trong dãy: ");
		for(int i = 0; i < n; i++) {
			if (checkSochan(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static boolean checkSohoanhao(int n) {
		int sum = 0;

		for(int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	
	public static boolean checkSochan(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}
	
}
