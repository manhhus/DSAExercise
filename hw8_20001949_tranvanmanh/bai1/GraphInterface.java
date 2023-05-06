package hw8_20001949_tranvanmanh.bai1;
import java.util.List;
public interface GraphInterface {
	int numVertices();
	int numEdge();
	boolean isEdge(int u, int v);
	void addEdge(int u, int v);
	int degreeGraph();
	List<Integer> adjVertices(int v);
	List<Integer> BFS(int v);
	void DFS(int v);
}
