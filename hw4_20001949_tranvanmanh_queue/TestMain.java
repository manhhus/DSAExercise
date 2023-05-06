package hw4_20001949_tranvanmanh_queue;

public class TestMain {
	public static void main(String[] args) {

		ArrayQueue<String> alq = new ArrayQueue<String>();
		alq.enqueue("Tom");
		alq.enqueue("likes");
		alq.enqueue("Jerry");
		alq.enqueue("very");
		alq.enqueue("much");
		System.out.println(alq.dequeue());
		while (!alq.isEmpty()) {
			String element = alq.dequeue();
			System.out.println(element);
		}
		
		
//		LinkedListQueue<String> lls = new LinkedListQueue<String>();
//		lls.enqueue("Tom");
//		lls.enqueue("likes");
//		lls.enqueue("Jerry");
//		lls.enqueue("very");
//		lls.enqueue("much");
//		System.out.println(lls.dequeue());
//		while (!lls.isEmpty()) {
//			String element = lls.dequeue();
//			System.out.println(element);
//		}		
//		if (lls.isEmpty())
//			System.out.println("The stack the elements of which is listed using method pop is empty!!");
//		else
//			System.out.println("The stack the elements of which is listed using method pop is not empty!!");
//			
	}
}