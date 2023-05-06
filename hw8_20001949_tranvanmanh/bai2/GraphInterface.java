package hw8_20001949_tranvanmanh.bai2;
import java.util.List;
public interface GraphInterface {
	int numVertices();
	int numEdge();
	boolean isEdge(int u, int v);
	void addEdge(int u, int v, int w);
	int degreeGraph();
	List<Integer> adjVertices(int v);
}
