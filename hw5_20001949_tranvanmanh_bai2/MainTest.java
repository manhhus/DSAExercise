package hw5_20001949_tranvanmanh_bai2;

public class MainTest {
	public static void main(String[] args) {
		
		 ExpressionTree<Character> et = new ExpressionTree<>();
		 
	  	 et.addRoot('*');	        
	  	 et.addLeft(et.addLeft(et.addLeft(et.root(), '-'),'/'),'2');
		 et.addRight(et.addLeft(et.addLeft(et.root(), '-'),'/'),'1');		    
		 et.addRight(et.addLeft(et.root(), '-'),'1');
		 et.addLeft(et.addRight(et.root(), '+'),'1');
		 et.addRight(et.addRight(et.root(), '+'),'2');
	     //in cây
	     et.preorderPrint(et.root());
	     System.out.println();
	     et.inorderPrint(et.root());
	     System.out.println();
	     et.postorderPrint(et.root());
	     //tính kết quả
	     System.out.println("\nKết quả bằng: ");
	     System.out.println(et.evaluateTree(et.root()));
        
	}
	
}
