package hw5_20001949_tranvanmanh_bai1;
@SuppressWarnings("unchecked")
public class ArrayBinaryTree<E> implements BinaryTreeInterface<E, Integer> {
	private E[] array;
	private int n = 0;
	private int defaultsize = 100;
		
	public ArrayBinaryTree(){
			array = (E[]) new Object[defaultsize];
			
	}
	//update methods
	public void setRoot(E element) {
		// Set element to root of an empty tree (at index 1)
		if (array[1] == null) {
			array[1] = element;
			n++;
		} else { 
			System.out.println("Đã tồn tại root");
		}
	}
	
	public void setLeft(int p, E element) {
		// Set left child of p (at index 2p)
		if (array[2*p] == null) {
			array[2*p] = element;
			n++;
		} else { 
			System.out.println("Đã tồn tại left");
		}
	}
	
	public void setRight(int p, E element) {
		// Set right child of p (at index 2p+1)
		if (array[2*p+1] == null) {
			array[2*p+1] = element;
			n++;
		} else { 
			System.out.println("Đã tồn tại right");
		}
	}
	@Override
	public Integer root() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return n == 0;
	}
	@Override
	public int numChildren(Integer p) {
		// TODO Auto-generated method stub
		if (array[2*p+1] != null && array[2*p] != null) 
			return 2;	
		else if (array[2*p+1] != null || array[2*p] != null)
			return 1;
		return 0;
	}
	@Override
	public Integer parent(Integer p) {
		// TODO Auto-generated method stub
		return p/2;
	}
	@Override
	public Integer left(Integer p) {
		// TODO Auto-generated method stub
		return 2*p;
	}
	@Override
	public Integer right(Integer p) {
		// TODO Auto-generated method stub
		return 2*p+1;
	}
	@Override
	public Integer sibling(Integer p) {
		// TODO Auto-generated method stub
		if (p % 2 == 0) 
			return p+1;
		else 
			return p-1;		
	}
	
}