package hw3_20001949_tranvanmanh_linkedlist;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		SimpleLinkedList<WordCount> wl = new SimpleLinkedList<WordCount>();
		Scanner reader = new Scanner(System.in);
		// read data
		String text = reader.nextLine();
		// b�? dấu cách
		String[] tokens = text.split(" ");
		
		for(int i = 0 ; i < tokens.length ; i++) {
			// thêm từng từ vào danh sách
			WordCount w = new WordCount(tokens[i]);
			
			int id = wl.indexOf(w);		
			if(id == -1) {
				wl.add(w);
			}
			else {
				wl.get(id).upCount();
			}
		}

		wl.printList();
		
		reader.close();
	}
}
