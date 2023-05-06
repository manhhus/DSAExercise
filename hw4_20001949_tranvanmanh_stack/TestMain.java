package hw4_20001949_tranvanmanh_stack;

public class TestMain {
	public static void main(String[] args) {
		ArrayStack<String> als = new ArrayStack<String>();

//		Scanner reader = new Scanner(System.in);
//		
//		String text = reader.nextLine();
//		
//		String[] hoten = text.split(" ");
//		String s = "";
//		for(int i = 0; i < hoten.length; i++) {
//			s += hoten; 
//		}
		
		String s = "tranvanmanh";
		System.out.println(s.charAt(0));
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0) {
				als.push(Character.toString(s.charAt(i)));
			}	
			if(i % 3 == 0) {	
				als.pop();
			}
		}

		while (!als.isEmpty()) {
			String element = als.pop();
			System.out.println(element);
		}
//		reader.close();
//		
//		ArrayListStack<String> lls = new ArrayListStack<String>();
//		lls.push("Tom");
//		lls.push("likes");
//		lls.push("Jerry");
//		lls.push("very");
//		lls.push("much");
//		System.out.println(lls.pop());
		
//		while (!lls.isEmpty()) {
//			String element = lls.pop();
//			System.out.println(element);
//		}
		
		
//		LinkedListStack<String> lls = new LinkedListStack<String>();
//		lls.push("Tom");
//		lls.push("likes");
//		lls.push("Jerry");
//		lls.push("very");
//		lls.push("much");
//		System.out.println(lls.pop());
//		while (!lls.isEmpty()) {
//			String element = lls.pop();
//			System.out.println(element);
//		}
		
//		if (lls.isEmpty())
//			System.out.println("The stack the elements of which is listed using method pop is empty!!");
//		else
//			System.out.println("The stack the elements of which is listed using method pop is not empty!!");
			
	}
}