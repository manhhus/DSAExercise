package hw8_20001949_tranvanmanh.bai1;

public class TestMain {
	public static void main(String[] args) {
		Graph gr = new Graph(6);
		gr.addEdge(0, 1);
		gr.addEdge(0, 2);
		gr.addEdge(2, 3);
		gr.addEdge(2, 4);
		gr.addEdge(1, 5);
		for(Integer e : gr.BFS(2)) {
			System.out.print(e + " ");
		}
		gr.DFS(1);
		System.out.println(gr.degreeGraph());
		System.out.println(gr.isEdge(1, 1));
		for(Integer e : gr.adjVertices(1)) {
			System.out.print(e + " ");
		}
		

	}
}
