package hw6_20001949_tranvanmanh_bai2;

public class TestMain {
    public static void main(String[] args) {
        MinHeapPriorityQueue<Integer, Character> a = new MinHeapPriorityQueue<Integer, Character>();
        a.insert(2,'A');
        a.insert(3,'A');
        a.insert(5,'A');
        a.insert(1,'A');
        a.insert(4,'A');
        a.insert(7,'A');
        a.insert(6,'A');
        a.printEntry(a.min()); 
 //       a.removeMin();        
     //   a.print();
    }
}