package hw7_20001949_tranvanmanh_bai2;

public class TestMain {
	public static void main(String[] args) {

		BinarySearchTree<Integer> lbt = new BinarySearchTree<Integer>();
		lbt.insert(null, 1);
		lbt.insert(lbt.insert(lbt.root(), 2) ,3);
		lbt.insert(lbt.insert(lbt.root(), 6) ,7);		
			 
    //    lbt.print(lbt.root(), 0);
		System.out.println( lbt.findMin());
        System.out.println( lbt.search(3, lbt.root()) );
	}
}
