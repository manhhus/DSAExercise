package hw6_20001949_tranvanmanh_bai1;

public class TestMain {
	public static void main(String[] args) {		
	
//		UnsortedArrayPriorityQueue<Integer,Character> a = 
//				new UnsortedArrayPriorityQueue<Integer,Character>();
//		a.insert(3,'D');
//		a.insert(2,'A');
//		a.insert(4,'B');
//		a.removeMin();
//		a.printEntry(a.min());
//		a.print();
		
//		SortedArrayPriorityQueue<Integer,Character> a = 
//				new SortedArrayPriorityQueue<Integer,Character>();
//		a.insert(3,'D');
//		a.insert(2,'A');
//		a.insert(4,'E');
//		a.insert(7,'B');
//		a.insert(6,'C');
//		a.removeMin();
//		a.printEntry(a.min());
//		a.print();
		
//		UnsortedLinkedPriorityQueue<Integer,Character> a = new UnsortedLinkedPriorityQueue<Integer,Character>();
//		a.insert(3,'D');
//		a.insert(2,'A');
//		a.insert(4,'E');
//		a.insert(7,'B');
//		a.insert(6,'C');
//		a.removeMin();
//		a.printEntry(a.min());
//		a.print();
		
		SortedLinkedPriorityQueue<Integer,Character> a = new SortedLinkedPriorityQueue<Integer,Character>();
		a.insert(3,'D');
		a.insert(2,'A');
		a.insert(4,'E');
		a.insert(7,'B');
		a.insert(6,'C');
//		a.removeMin();
		System.out.print(a.min());
//		a.print();
	}
}
