package hw5_20001949_tranvanmanh_bai1;

import java.io.FileWriter;

public class LinkedBinaryTree<E> implements BinaryTreeInterface<E,LinkedBinaryTree.Node<E>> {
	protected static class Node<E> {
		
		public E element; // an element stored at this node
		public Node<E> parent; // a reference to the parent node (if any)
		public Node<E> left; // a reference to the left child
		public Node<E> right; // a reference to the right child
	// Constructs a node with the given element and neighbors. ∗/
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
			element = e;
			parent = above;
			left = leftChild;
			right = rightChild;
		}		
	}
	private int size = 0;
	protected Node<E> root = null;
	//update methods
	public Node<E> addRoot(E element) {
		// Add element to root of an empty tree
		if (this.root != null) {
			System.out.println("Has root");
		} else {
            root = new Node<E>(element, null, null, null);
            size++;
        } 
        return root;  
	}
	
	public Node<E> addLeft(Node<E> p, E element) {
		// Add element to left child node of p if empty
         if (p.left != null) {
            System.out.println("Exist left");
        } else {
            p.left = new Node<E>(element, p, null, null);
            size++;
        }
        return p.left;
	}
	
	public Node<E> addRight(Node<E> p, E element) {
		// Add element to right child node of p if empty
		if (p.right != null) {
            System.out.println("Exist right");
        } else {
            p.right = new Node<E>(element, p, null, null);
            size++;
        }
        return p.right;
	}
	
	public void set(Node<E> p, E element) {
		// set element to nnode p		
		p.element = element;
	
	}
	@Override
	public Node<E> root() {
		// TODO Auto-generated method stub
		return root;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	@Override
	public int numChildren(Node<E> p) {
		// TODO Auto-generated method stub
		if (p.left != null && p.right != null) 
			return 2;	
		else if (p.left != null || p.right != null)
			return 1;
		return 0;
	}
	@Override
	public Node<E> parent(Node<E> p) {
		// TODO Auto-generated method stub
		return p.parent;
	}
	@Override
	public Node<E> left(Node<E> p) {
		// TODO Auto-generated method stub
		return p.left;
	}
	@Override
	public Node<E> right(Node<E> p) {
		// TODO Auto-generated method stub
		return p.right;
	}
	@Override
	public Node<E> sibling(Node<E> p) {
		// TODO Auto-generated method stub
		if (p.parent.left == p) 
			return p.right;
		else if (p.parent.right == p)
			return p.left;
		return null;
	}
	
	static final int count = 2;
	
	public void print(Node<E> p, int space, FileWriter fw) {
	    if (p == null)
	        return;
	    space += count;
	    print(p.right, space, fw);
	    
	    for (int i = count; i < space; i++) {
	    	try {
	    		fw.write(" ");
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	    try {
    		fw.write(p.element.toString()+"\n");
        } catch (Exception e) {
            System.out.println(e);
        }
	    print(p.left, space, fw);
	
	}
	
	public void print2(Node<E> p, int space) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Asus VivoBook\\eclipse-workspace\\CTDL_TT\\src\\hw5_20001949_tranvanmanh_bai1\\output.txt");
			print(p, space, fw);
			fw.close();
		} catch (Exception e) {
            System.out.println(e);
        }
	}
	
	public Node<E> addLeftRecursive(Node<E> current, E value) {
	    if (current == null) {
	        return new Node<E>(value,null,null,null);
	    } 
	    current.left = addLeftRecursive(current.left, value);
	    return current;
	}
	
	public Node<E> addRightRecursive(Node<E> current, E value) {
	    if (current == null) {
	        return new Node<E>(value,null,null,null);
	    } 
	    current.right = addRightRecursive(current.right, value);
	    return current;
	}
}