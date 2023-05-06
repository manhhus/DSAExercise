package hw8_20001949_tranvanmanh.bai2;

public class TestMain {
	public static void main(String[] args) {
		WeighGraph gr = new WeighGraph(6);
		gr.addEdge(2, 4, 2);
		gr.addEdge(2, 3, 3);
		gr.addEdge(2, 1, 4);
		gr.addEdge(2, 5, 5);
		gr.addEdge(2, 0, 5);
		System.out.println(gr.degreeGraph());
		System.out.println(gr.isEdge(2, 1));
		for(Integer e : gr.adjVertices(2)) {
			System.out.print(e + " ");
		}
		
	}
}
