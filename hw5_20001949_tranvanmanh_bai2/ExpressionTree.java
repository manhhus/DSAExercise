package hw5_20001949_tranvanmanh_bai2;

import hw5_20001949_tranvanmanh_bai1.LinkedBinaryTree;

public class ExpressionTree<E> extends LinkedBinaryTree<E> {
	public void preorderPrint(Node<E> p) {
		//pre-order traversal of tree with root p
		if (p == null) return;
		System.out.print(p.element);
		preorderPrint(p.left);	
		preorderPrint(p.right);
	}
	public void postorderPrint(Node<E> p) {
		//post-order traversal of tree with root p
		if (p == null) return;
		postorderPrint(p.left);	
		postorderPrint(p.right);
		System.out.print(p.element);
	}
	public void inorderPrint(Node<E> p) {
		//in-order traversal of tree with root p
		if (p == null) return;
		inorderPrint(p.left);	
		System.out.print(p.element);
		inorderPrint(p.right);
	}
	
	private double applyOperator(Character operator, double a, double b) {

        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0.0) {
                    return 0;
                }
                return a / b;
            default:
                return 0;
        }
    }

    public double evaluateTree(Node<E> p) { 
        if (p == null) {
            return 0.0;
        }
        if (p.left == null || p.right == null) {
            return Double.parseDouble(String.valueOf(p.element));
        }
        double a = evaluateTree(p.left); 
        double b = evaluateTree(p.right); 
        return applyOperator((Character) p.element, a, b);
    }
}
