package hw8_20001949_tranvanmanh.bai2;

import java.util.*;

public class WeighGraph implements GraphInterface {
	private int v;
	private double[][] adj;
	
	public WeighGraph(int v) {
		this.v = v;
		this.adj = new double[v][v];
		for(int i = 0; i<v ; i++) 
			for (int j = 0; j<v ; j++) 
				adj[i][j] = i == j ? 0 : Double.NEGATIVE_INFINITY;
		
	}
	@Override
	public int numVertices() {
		
		return v;
	}
	@Override
	public int numEdge() {
		int numb = 0;
		for(int i = 0; i<v ; i++) {
			for (int j = 0; j<v ; j++) {
				if (adj[i][j] > 0) 
					numb++;
			}
		}
		return numb;
	}
	@Override
	public boolean isEdge(int u, int v) {
		
		return adj[v][u] > 0;
	}
	@Override
	public void addEdge(int u, int v, int w) {
		adj[u][v] = w;
		adj[v][u] = w;
	}
	@Override
	public int degreeGraph() {
		int degree = 0;
		for(int i = 0; i<v ; i++) {
			int temp = 0;
			for (int j = 0; j<v ; j++) {
				if (adj[i][j] > 0) temp++;
			}
			if (temp > degree) degree = temp;
		}
		return degree;
	}
	@Override
	public List<Integer> adjVertices(int u) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<v; i++) {
			if(adj[u][i] > 0)
				list.add(i);
		}
		return list;
	}
	
}
