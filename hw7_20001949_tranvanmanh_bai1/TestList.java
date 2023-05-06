package hw7_20001949_tranvanmanh_bai1;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArrayList<Integer> list = new SimpleArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(3);
		list.add(6);
		list.add(5);
		list.add(8);
		
		long start = System.nanoTime();	
		System.out.println(list.sortedBinarySearch(0, 7, 1));
        long end = System.nanoTime();
        System.out.println("Thời gian chạy nano: " + (end - start)); 
 
        for(Integer e : list) {
			System.out.print(e + " ");
		}
	}

}
