package hw5_20001949_tranvanmanh_bai1;

import java.io.IOException;

public class MainTest {
	public static void main(String[] args) throws IOException {
		ArrayBinaryTree<Integer> abt = new ArrayBinaryTree<Integer>();
		abt.setRoot(1);
		abt.setLeft(1, 4);
		abt.setRight(1, 5);
		abt.setRight(2, 3);
		System.out.println(abt.numChildren(1));
		
//		ArrayBinaryTree<Integer> ab = new ArrayBinaryTree<Integer>();
//		System.out.println(ab.isEmpty());
		
		
//		LinkedBinaryTree<Integer> lbt = new LinkedBinaryTree<Integer>();
//		lbt.addRoot(1);
//		lbt.addLeft(lbt.addLeft(lbt.root(), 2) ,3);
//		lbt.addRight(lbt.addRight(lbt.root(), 6) ,7);		
//		lbt.inorderPrint(lbt.root());		 
//        lbt.print2(lbt.root(), 0);
//       
	}
		
}
