package hw3_20001949_tranvanmanh_arraylist;

public class TestList {

	public static void main(String[] args) {

		// test cho array
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
		System.out.println(list.sortedBinarySearch(0, 7, 6));
        long end = System.nanoTime();
        System.out.println("Thời gian chạy nano: " + (end - start)); 
        
        long start1 = System.nanoTime();	
		System.out.println(list.unSortedBinarySearch(0, 7, 6));
        long end1 = System.nanoTime();
        System.out.println("Thời gian chạy nano: " + (end1 - start1));
        
        long start2 = System.nanoTime();	
		System.out.println(list.sequentialSearch(6));
        long end2 = System.nanoTime();
        System.out.println("Thời gian chạy nano: " + (end2 - start2));
      
       
        for(Integer e : list) {
			System.out.print(e + " ");
		}       
	}

}
