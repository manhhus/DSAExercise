package hw7_20001949_tranvanmanh_bai2;

public class BinarySearchTree<E extends Comparable<E>> extends LinkedBinaryTree<E> {
	
	public Node<E> insert(Node<E> root,E element) {
        if (root == null) {
            size++;
            Node<E> node = new Node<E>(element, null, null, null);
            if (this.root == null) 
                this.root = node; 
            return node;

        } else if (element.compareTo(root.getElement()) == -1) 
            root.setLeft(insert(root.left, element));
        
         else if (element.compareTo(root.getElement()) == 1) 
            root.setRight(insert(root.right, element));
        
         else throw new IllegalStateException("Đã tồn tại");
        return root;
    }

    public Node<E> delete(E element, Node<E> root) {
        if (root == null) 
            return root;
        
        if (element.compareTo(root.element) == -1) 
            root.setLeft(delete(element, root.left));
        else if (element.compareTo(root.element) == 1) 
            root.setRight(delete(element, root.right));
        else {
            if (root.getLeft() == null) 
                return root.getRight();
            else if (root.getParent() == null) 
                return root.getLeft();
            
            root.setElement(findMin(root.right).getElement());
            root.setRight(delete(root.element, root.right));
        }
        return root;
    }

    public Node<E> search(E element, Node<E> root) {
        while (root != null) {
            if (element == root.element)
                return root;
            else if (element.compareTo(root.element) == -1) 
                root = root.left;
            else 
                root = root.right;
        }
        return null;
    }
    
    public E findMin() {
        Node<E> temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.element;
    }

    public Node<E> findMin(Node<E> root) {
    	Node<E> temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
    
}
