package hw3_20001949_tranvanmanh_linkedlist;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
		list.add(11);
		list.add(10);
		list.addBot(9);
		list.add(8);
		list.add(7);
		System.out.println(list.get(0));
		list.set(0, 11);
		System.out.println(list.get(0));
		list.remove(11);
		System.out.println(list.removeTop());
		list.printList();
		System.out.println();
		System.out.println(list.isContain(10));
	}

}
