package hw7_20001949_tranvanmanh_bai2;

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
		public E getElement() {
            return element;
        }

        public Node<E> getLeft() {
            return left;
        }

        public Node<E> getParent() {
            return parent;
        }

        public Node<E> getRight() {
            return right;
        }
        
        public void setElement(E element) {
            this.element = element;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}
        
	}
	protected int size = 0;
	protected Node<E> root = null;
	
	public Node<E> addRoot(E element) {
		
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
		
		return root;
	}
	@Override
	public int size() {
		
		return size;
	}
	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}
	@Override
	public int numChildren(Node<E> p) {
		
		if (p.left != null && p.right != null) 
			return 2;	
		else if (p.left != null || p.right != null)
			return 1;
		return 0;
	}
	@Override
	public Node<E> parent(Node<E> p) {
		
		return p.parent;
	}
	@Override
	public Node<E> left(Node<E> p) {
		
		return p.left;
	}
	@Override
	public Node<E> right(Node<E> p) {
		
		return p.right;
	}
	@Override
	public Node<E> sibling(Node<E> p) {
		
		if (p.parent.left == p) 
			return p.right;
		else if (p.parent.right == p)
			return p.left;
		return null;
	}
	
	static final int count = 2;
	public void print(Node<E> root, int kc)
	{
	    if (root == null)
	        return;
	    kc += count;
	    print(root.right, kc);
	    System.out.print("\n");
	    for (int i = count; i < kc; i++)
	        System.out.print(" ");
	    System.out.print(root.element + "\n");
	    print(root.left, kc);
	}

}