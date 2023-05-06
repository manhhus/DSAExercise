package hw2_20001949_tranvanmanh;

import java.util.Scanner;
public class TestCard {  //Bài 6 bao gồm Sort, TestCard, Card
	
	public static void input(Scanner input,Card[] array) {
		for(int i = 0 ; i < array.length; i++) {
			System.out.println("enter card " + (i+1));
			System.out.println("enter rank: ");
			int r = Integer.parseInt(input.nextLine());
			System.out.println("enter suit: ");
			int s = Integer.parseInt(input.nextLine());
			array[i] = new Card(r,s);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter n cards: ");
		int n = Integer.parseInt(input.nextLine());
		Card[] array = new Card[n];
		Sort<Card> arr = new Sort<Card>(array);
		input(input,array);
		arr.setArray(array);
		arr.bubbleSort();
		System.out.println("array after sort");
		arr.printArr();
	}

}

