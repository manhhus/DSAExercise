package hw4_20001949_tranvanmanh_bai5;

import hw4_20001949_tranvanmanh_queue.*;

import hw4_20001949_tranvanmanh_stack.*;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = in.nextLine();
        in.close();
        boolean check = true;
/*       
//chỉ sử dụng stack
        ArrayListStack<Character> als = new ArrayListStack<Character>();
        for(int i = 0; i < text.length()/2; i++) {
        	if(Character.isLetter(text.charAt(i))) {
        		als.push(text.charAt(i));
        	}
        }
        for(int i =  text.length()/2+1 ; i < text.length()-1; i++) {
        	if(Character.isLetter(text.charAt(i))) {   
        		if(!als.pop().equals(text.charAt(i)))
        			check = false;
        	}
        	System.out.print(als.top());
        }
        
        if (check) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
*/
//sử dụng cả queue và stack
      ArrayStack<Character> fw = new ArrayStack<Character>();
      ArrayQueue<Character> bw = new ArrayQueue<Character>();        
        for(int i = 0; i < text.length(); i++) {
       	if(Character.isLetter(text.charAt(i))) {
        		fw.push(text.charAt(i));
        		bw.enqueue(text.charAt(i));
        	}
        }

        while (!fw.isEmpty()) {
			if(!fw.pop().equals(bw.dequeue())) {
				check = false;
			}			
		}
        if (check) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }
	}
}
